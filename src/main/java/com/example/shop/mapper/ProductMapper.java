package com.example.shop.mapper;


import com.example.shop.dto.*;
import com.example.shop.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

    default Product update(ProductDto productDto, Product product) {

        if (productDto instanceof HddDto hddDto && product instanceof HardDisc hardDisc) {
            return updateHardDisc(hddDto, hardDisc);
        }

        if (productDto instanceof LaptopDto laptopDto && product instanceof Laptop laptop) {
            return updateLaptop(laptopDto, laptop);
        }

        if (productDto instanceof MonitorDto monitorDto && product instanceof Monitor monitor) {
            return updateMonitor(monitorDto, monitor);
        }

        if (productDto instanceof PcDto pcDto && product instanceof PersonalComputer personalComputer) {
            return updatePersonalComputer(pcDto, personalComputer);
        }

        return null;

    }


    default Product map(ProductDto productDto) {

        if (productDto instanceof HddDto hddDto) {
            return mapHardDisc(hddDto);
        }

        if (productDto instanceof LaptopDto laptopDto) {
            return mapLaptop(laptopDto);
        }

        if (productDto instanceof MonitorDto monitorDto) {
            return mapMonitor(monitorDto);
        }

        if (productDto instanceof PcDto pcDto) {
            return mapPersonalComputer(pcDto);
        }

        return null;
    }

    default ProductDto mapToDto(Product product) {

        if (product instanceof HardDisc hardDisc) {
            return mapHddDto(hardDisc);
        }
        if (product instanceof Laptop laptop) {

            return mapLaptopDto(laptop);

        }
        if (product instanceof Monitor monitor) {
            return mapMonitorDto(monitor);

        }
        if (product instanceof PersonalComputer personalComputer) {
            return mapPCDto(personalComputer);

        }

        return null;

    }


    Product updatePersonalComputer(PcDto pcDto, @MappingTarget PersonalComputer personalComputer);

    Product updateMonitor(MonitorDto monitorDto, @MappingTarget Monitor monitor);

    Product updateLaptop(LaptopDto laptopDto, @MappingTarget Laptop laptop);

    Product updateHardDisc(HddDto hddDto, @MappingTarget HardDisc hardDisc);

    PcDto mapPCDto(PersonalComputer personalComputer);

    MonitorDto mapMonitorDto(Monitor monitor);

    LaptopDto mapLaptopDto(Laptop laptop);

    HddDto mapHddDto(HardDisc hardDisc);

    PersonalComputer mapPersonalComputer(PcDto pcDto);

    Monitor mapMonitor(MonitorDto monitorDto);

    Laptop mapLaptop(LaptopDto laptopDto);

    HardDisc mapHardDisc(HddDto hddDto);


}
