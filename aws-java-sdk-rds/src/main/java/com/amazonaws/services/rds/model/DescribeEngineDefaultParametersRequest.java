/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEngineDefaultParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEngineDefaultParametersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB parameter group family.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora5.6</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql5.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql8.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql10</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql11</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql12</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql13</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql14</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-ee-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.5</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.6</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql5.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql8.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-cdb-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-cdb-21</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-cdb-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-cdb-21</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres10</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres11</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres12</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres13</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres14</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-15.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-15.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-15.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-15.0</code>
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupFamily;
    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeEngineDefaultParameters</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * Default constructor for DescribeEngineDefaultParametersRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public DescribeEngineDefaultParametersRequest() {
    }

    /**
     * Constructs a new DescribeEngineDefaultParametersRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB parameter group family.</p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aurora5.6</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-mysql5.7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-mysql8.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql10</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql11</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql12</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql13</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql14</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-oracle-ee-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.4</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.5</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.6</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql5.7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql8.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee-cdb-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee-cdb-21</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2-cdb-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2-cdb-21</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres10</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres11</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres12</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres13</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres14</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-11.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-12.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-13.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-14.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-15.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-11.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-12.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-13.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-14.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-15.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-11.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-12.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-13.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-14.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-15.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-11.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-12.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-13.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-14.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-15.0</code>
     *        </p>
     *        </li>
     */
    public DescribeEngineDefaultParametersRequest(String dBParameterGroupFamily) {
        setDBParameterGroupFamily(dBParameterGroupFamily);
    }

    /**
     * <p>
     * The name of the DB parameter group family.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora5.6</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql5.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql8.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql10</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql11</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql12</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql13</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql14</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-ee-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.5</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.6</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql5.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql8.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-cdb-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-cdb-21</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-cdb-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-cdb-21</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres10</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres11</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres12</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres13</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres14</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-15.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-15.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-15.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-15.0</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB parameter group family.</p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aurora5.6</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-mysql5.7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-mysql8.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql10</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql11</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql12</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql13</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql14</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-oracle-ee-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.4</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.5</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.6</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql5.7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql8.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee-cdb-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee-cdb-21</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2-cdb-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2-cdb-21</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres10</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres11</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres12</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres13</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres14</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-11.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-12.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-13.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-14.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-15.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-11.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-12.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-13.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-14.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-15.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-11.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-12.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-13.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-14.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-15.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-11.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-12.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-13.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-14.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-15.0</code>
     *        </p>
     *        </li>
     */

    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB parameter group family.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora5.6</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql5.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql8.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql10</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql11</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql12</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql13</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql14</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-ee-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.5</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.6</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql5.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql8.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-cdb-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-cdb-21</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-cdb-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-cdb-21</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres10</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres11</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres12</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres13</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres14</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-15.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-15.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-15.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-15.0</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB parameter group family.</p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>aurora5.6</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-mysql5.7</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-mysql8.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-postgresql10</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-postgresql11</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-postgresql12</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-postgresql13</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-postgresql14</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>custom-oracle-ee-19</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mariadb10.2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mariadb10.3</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mariadb10.4</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mariadb10.5</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mariadb10.6</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mysql5.7</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mysql8.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-ee-19</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-ee-cdb-19</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-ee-cdb-21</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se2-19</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se2-cdb-19</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se2-cdb-21</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>postgres10</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>postgres11</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>postgres12</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>postgres13</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>postgres14</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ee-11.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ee-12.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ee-13.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ee-14.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ee-15.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ex-11.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ex-12.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ex-13.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ex-14.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ex-15.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-se-11.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-se-12.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-se-13.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-se-14.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-se-15.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-web-11.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-web-12.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-web-13.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-web-14.0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-web-15.0</code>
     *         </p>
     *         </li>
     */

    public String getDBParameterGroupFamily() {
        return this.dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB parameter group family.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora5.6</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql5.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql8.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql10</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql11</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql12</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql13</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql14</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-ee-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.5</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb10.6</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql5.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql8.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-cdb-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-cdb-21</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-cdb-19</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-cdb-21</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres10</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres11</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres12</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres13</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres14</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee-15.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex-15.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se-15.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-11.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-12.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-13.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-14.0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web-15.0</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB parameter group family.</p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aurora5.6</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-mysql5.7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-mysql8.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql10</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql11</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql12</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql13</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql14</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-oracle-ee-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.4</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.5</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb10.6</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql5.7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql8.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee-cdb-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee-cdb-21</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2-cdb-19</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2-cdb-21</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres10</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres11</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres12</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres13</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres14</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-11.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-12.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-13.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-14.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee-15.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-11.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-12.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-13.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-14.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex-15.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-11.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-12.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-13.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-14.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se-15.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-11.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-12.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-13.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-14.0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web-15.0</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngineDefaultParametersRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        setDBParameterGroupFamily(dBParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * 
     * @return This parameter isn't currently supported.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter isn't currently supported.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        This parameter isn't currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngineDefaultParametersRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter isn't currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngineDefaultParametersRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can
     *        retrieve the remaining results.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can
     *         retrieve the remaining results.</p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can
     *        retrieve the remaining results.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngineDefaultParametersRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeEngineDefaultParameters</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeEngineDefaultParameters</code> request.
     *        If this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeEngineDefaultParameters</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeEngineDefaultParameters</code> request.
     *         If this parameter is specified, the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeEngineDefaultParameters</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeEngineDefaultParameters</code> request.
     *        If this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngineDefaultParametersRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: ").append(getDBParameterGroupFamily()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEngineDefaultParametersRequest == false)
            return false;
        DescribeEngineDefaultParametersRequest other = (DescribeEngineDefaultParametersRequest) obj;
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEngineDefaultParametersRequest clone() {
        return (DescribeEngineDefaultParametersRequest) super.clone();
    }

}
