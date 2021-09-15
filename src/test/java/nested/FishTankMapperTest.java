package nested;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class FishTankMapperTest {

    @Test
    void mapToFishTankTest() {
        //given
        LocalDate date = LocalDate.of(2021,9,11);
        String reportTitle = "Report Title";
        String organisationName = "Organisation";
        String ornament = "Teardrop Shaped";
        String interiorColor = "Blue";
        String fishColor = "Orange";
        String type = "Goldfish";
        String material = "Glass";
        double volume = 5.3;

        ReportDto reportDto = createReportDto(date, reportTitle, organisationName);
        QualityDto qualityDto = createQualityDto(date, true, reportDto);
        InteriorDto interiorDto = createInteriorDto(interiorColor, ornament);
        FishDto fishDto = createFishDto(fishColor, type);
        FishTankDto fishTankDto = createFishTankDto(fishDto, interiorDto, qualityDto, material, volume);

        //when
        FishTank result = FishTankMapper.INSTANCE.mapToFishTank(fishTankDto);

        //then
        assertThat(result).isEqualToComparingFieldByFieldRecursively(FishTank.builder()
                .fish(Fish.builder()
                        .color(fishColor)
                        .kind(type)
                        .build())
                .material(Material.builder()
                        .materialType(material)
                        .build())
                .quality(Quality.builder()
                        .dateOfApproval(date)
                        .qualityApproved(true)
                        .report(Report.builder()
                                .dateOfReport(date)
                                .title(reportTitle)
                                .organisation(Organisation.builder()
                                        .name(organisationName)
                                        .build())
                                .build())
                        .build())
                .ornament(ornament)
                .volume(volume)
                .build());
    }

    private FishTankDto createFishTankDto(FishDto fishDto, InteriorDto interiorDto, QualityDto qualityDto,
                                          String material, double volume) {
        return FishTankDto.builder()
                .fish(fishDto)
                .interior(interiorDto)
                .quality(qualityDto)
                .material(material)
                .volume(volume)
                .build();
    }

    private ReportDto createReportDto(LocalDate reportDate, String title, String name) {
        return ReportDto.builder()
                .dateOfReport(reportDate)
                .title(title)
                .organisationName(name)
                .build();
    }

    private QualityDto createQualityDto(LocalDate date, boolean approved, ReportDto reportDto) {
        return QualityDto.builder()
                .dateOfApproval(date)
                .qualityApproved(approved)
                .report(reportDto)
                .build();
    }

    private InteriorDto createInteriorDto(String color, String ornament) {
        return InteriorDto.builder()
                .color(color)
                .ornament(ornament)
                .build();
    }

    private FishDto createFishDto(String color, String type) {
        return FishDto.builder()
                .color(color)
                .type(type)
                .build();
    }
}