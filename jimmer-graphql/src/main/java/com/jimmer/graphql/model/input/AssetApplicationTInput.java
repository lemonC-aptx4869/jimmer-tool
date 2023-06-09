package com.jimmer.graphql.model.input;

import com.jimmer.graphql.model.entity.AssetApplicationT;
import lombok.Data;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.sql.*;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.lang.Nullable;

import java.time.LocalDateTime;

/*
 * 应用资产表
 */
@Data
public class AssetApplicationTInput implements Input<AssetApplicationT> {

    private static final Converter CONVERTER = Mappers.getMapper(Converter.class);

    private String tid;
    private String assetId;
    private String proId;
    private String appType;
    private String appUrl;
    private String sysArchiType;
    private String authLevel;
    private LocalDateTime onlineTime;
    private LocalDateTime offlineTime;
    private String icon;
    private String iconUrl;
    private String netType;
    private String sysDeploy;
    private String tenantId;
    private String revision;
    private String createdBy;
    private LocalDateTime createdTime;
    private String updatedBy;
    private LocalDateTime updatedTime;
    private String isDel;

    @Override
    public AssetApplicationT toEntity() {
        return CONVERTER.toAssetApplicationT(this);
    }

    @Mapper
    interface Converter {
        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        AssetApplicationT toAssetApplicationT(AssetApplicationTInput input);
    }

}