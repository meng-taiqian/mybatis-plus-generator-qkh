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

import javax.security.auth.login.Configuration;

/**
 * <p>
 * 模板路径配置项
 * </p>
 *
 * @author tzg hubin
 * @since 2017-06-17
 */
public class TemplateConfig {

    private String entity = ConstVal.TEMPLATE_ENTITY;

    private String service = ConstVal.TEMPLATE_SERVICE;

    private String serviceImpl = ConstVal.TEMPLATE_SERVICEIMPL;

    private String mapper = ConstVal.TEMPLATE_MAPPER;

    private String xml = ConstVal.TEMPLATE_XML;

    private String controller = ConstVal.TEMPLATE_CONTROLLER;

    private String baseMapper = ConstVal.TEMPLATE_BASE_MAPPER;

    private String iService = ConstVal.TEMPLATE_ISERVICE;

    private String iServiceImpl = ConstVal.TEMPLATE_ISERVICEIMPL;
    private String vo = ConstVal.TEMPLATE_VO;
    private String qryVo = ConstVal.TEMPLATE_QRYVO;
    private String entityQry = ConstVal.TEMPLATE_ENTITY_QRY;
    private String mapperTest = ConstVal.TEMPLATE_MAPPER_TEST;
    private String serviceTest = ConstVal.TEMPLATE_SERVICE_TEST;
    private String controllerTest = ConstVal.TEMPLATE_CONTROLLER_TEST;


    public String getEntity() {
        return entity;
    }

    public TemplateConfig setEntity(String entity) {
        this.entity = entity;
        return this;
    }

    public String getService() {
        return service;
    }

    public TemplateConfig setService(String service) {
        this.service = service;
        return this;
    }

    public String getServiceImpl() {
        return serviceImpl;
    }

    public TemplateConfig setServiceImpl(String serviceImpl) {
        this.serviceImpl = serviceImpl;
        return this;
    }

    public String getMapper() {
        return mapper;
    }

    public TemplateConfig setMapper(String mapper) {
        this.mapper = mapper;
        return this;
    }

    public String getXml() {
        return xml;
    }

    public TemplateConfig setXml(String xml) {
        this.xml = xml;
        return this;
    }

    public String getController() {
        return controller;
    }

    public TemplateConfig setController(String controller) {
        this.controller = controller;
        return this;
    }

    public String getBaseMapper() {
        return baseMapper;
    }

    public TemplateConfig setBaseMapper(String baseMapper) {
        this.baseMapper = baseMapper;
        return this;
    }

    public String getiService() {
        return iService;
    }

    public TemplateConfig setiService(String iService) {
        this.iService = iService;
        return this;
    }

    public String getiServiceImpl() {
        return iServiceImpl;
    }

    public TemplateConfig setiServiceImpl(String iServiceImpl) {
        this.iServiceImpl = iServiceImpl;
        return this;
    }

    public String getVo() {
        return vo;
    }

    public TemplateConfig setVo(String vo) {
        this.vo = vo;
        return this;
    }

    public String getQryVo() {
        return qryVo;
    }

    public TemplateConfig setQryVo(String qryVo) {
        this.qryVo = qryVo;
        return this;
    }

    public String getEntityQry() {
        return entityQry;
    }

    public TemplateConfig setEntityQry(String entityQry) {
        this.entityQry = entityQry;
        return this;
    }

    public String getMapperTest() {
        return mapperTest;
    }

    public TemplateConfig setMapperTest(String mapperTest) {
        this.mapperTest = mapperTest;
        return this;
    }

    public String getServiceTest() {
        return serviceTest;
    }

    public TemplateConfig setServiceTest(String serviceTest) {
        this.serviceTest = serviceTest;
        return this;
    }

    public String getControllerTest() {
        return controllerTest;
    }

    public TemplateConfig setControllerTest(String controllerTest) {
        this.controllerTest = controllerTest;
        return this;
    }
}
