/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/StartDataSourceIntrospection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDataSourceIntrospectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>rdsDataApiConfig</code> object data.
     * </p>
     */
    private RdsDataApiConfig rdsDataApiConfig;

    /**
     * <p>
     * The <code>rdsDataApiConfig</code> object data.
     * </p>
     * 
     * @param rdsDataApiConfig
     *        The <code>rdsDataApiConfig</code> object data.
     */

    public void setRdsDataApiConfig(RdsDataApiConfig rdsDataApiConfig) {
        this.rdsDataApiConfig = rdsDataApiConfig;
    }

    /**
     * <p>
     * The <code>rdsDataApiConfig</code> object data.
     * </p>
     * 
     * @return The <code>rdsDataApiConfig</code> object data.
     */

    public RdsDataApiConfig getRdsDataApiConfig() {
        return this.rdsDataApiConfig;
    }

    /**
     * <p>
     * The <code>rdsDataApiConfig</code> object data.
     * </p>
     * 
     * @param rdsDataApiConfig
     *        The <code>rdsDataApiConfig</code> object data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataSourceIntrospectionRequest withRdsDataApiConfig(RdsDataApiConfig rdsDataApiConfig) {
        setRdsDataApiConfig(rdsDataApiConfig);
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
        if (getRdsDataApiConfig() != null)
            sb.append("RdsDataApiConfig: ").append(getRdsDataApiConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDataSourceIntrospectionRequest == false)
            return false;
        StartDataSourceIntrospectionRequest other = (StartDataSourceIntrospectionRequest) obj;
        if (other.getRdsDataApiConfig() == null ^ this.getRdsDataApiConfig() == null)
            return false;
        if (other.getRdsDataApiConfig() != null && other.getRdsDataApiConfig().equals(this.getRdsDataApiConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRdsDataApiConfig() == null) ? 0 : getRdsDataApiConfig().hashCode());
        return hashCode;
    }

    @Override
    public StartDataSourceIntrospectionRequest clone() {
        return (StartDataSourceIntrospectionRequest) super.clone();
    }

}
