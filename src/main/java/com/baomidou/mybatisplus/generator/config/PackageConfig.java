/**
 * Copyright (c) 2011-2020, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.generator.config;

import com.baomidou.mybatisplus.toolkit.StringUtils;

import java.util.Arrays;

/**
 * <p>
 * 跟包相关的配置项
 *
 * @author YangHu, tangguo, hubin
 * @since 2016-08-30
 */
public class PackageConfig {

    /**
     * 父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
     */
    private String parent = "com.baomidou";

    /**
     * 父包模块名。
     */
    private String moduleName = null;

    /**
     * Entity包名
     */
    private String entity = "entity";

    /**
     * Service包名
     */
    private String service = "service";

    /**
     * Service Impl包名
     */
    private String serviceImpl = "service.impl";
    /**
     * Mapper包名
     */
    private String mapper = "mapper";

    /**
     * Mapper XML包名
     */
    private String xml = "mapper.xml";

    /**
     * Controller包名
     */
    private String controller = "web";

    /**
     * Vo包名
     */
    private String vo = "service.vo";

    /**
     * qryVo包名
     */
    private String qryVo = "service.vo";
    private String entityQry = "entity.qry";
    private String mapperTest = "test.mapper";
    private String serviceTest = "test.service";
    private String controllerTest = "test.controller";

    public String getParent() {
        if (StringUtils.isNotEmpty(moduleName)) {
            return parent + "." + moduleName;
        }
        return parent;
    }

    public PackageConfig setParent(String parent) {
        this.parent = parent;
        return this;
    }

    public String getModuleName() {
        return moduleName;
    }

    public PackageConfig setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    public String getEntity() {
        return entity;
    }

    public PackageConfig setEntity(String entity) {
        this.entity = entity;
        return this;
    }

    public String getService() {
        return service;
    }

    public PackageConfig setService(String service) {
        this.service = service;
        return this;
    }

    public String getServiceImpl() {
        return serviceImpl;
    }

    public PackageConfig setServiceImpl(String serviceImpl) {
        this.serviceImpl = serviceImpl;
        return this;
    }

    public String getMapper() {
        return mapper;
    }

    public PackageConfig setMapper(String mapper) {
        this.mapper = mapper;
        return this;
    }

    public String getXml() {
        return xml;
    }

    public PackageConfig setXml(String xml) {
        this.xml = xml;
        return this;
    }

    public String getController() {
        if (StringUtils.isEmpty(controller)) {
            return "web";
        }
        return controller;
    }

    public PackageConfig setController(String controller) {
        this.controller = controller;
        return this;
    }

    public String getVo() {
        return vo;
    }

    public PackageConfig setVo(String vo) {
        this.vo = vo;
        return this;
    }

    public String getQryVo() {
        return qryVo;
    }

    public PackageConfig setQryVo(String qryVo) {
        this.qryVo = qryVo;
        return this;
    }

    public PackageConfig setEntityQry(String entityQry) {
        this.entityQry = entityQry;
        return this;
    }

    public String getEntityQry() {
        return entityQry;
    }

    public PackageConfig setMapperTest(String mapperTest) {
        this.mapperTest = mapperTest;
        return this;
    }

    public String getMapperTest() {
        return mapperTest;
    }

    public PackageConfig setServiceTest(String serviceTest) {
        this.serviceTest = serviceTest;
        return this;
    }

    public String getServiceTest() {
        return serviceTest;
    }

    public PackageConfig setControllerTest(String controllerTest) {
        this.controllerTest = controllerTest;
        return this;
    }

    public String getControllerTest() {
        return controllerTest;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.asList("员工姓名", "姓名", "员工").contains("员工姓名"));
    }
}
