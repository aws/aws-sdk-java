/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains configuration information and metadata about a CloudFront function.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/FunctionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the CloudFront function.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the CloudFront function.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Contains configuration information about a CloudFront function.
     * </p>
     */
    private FunctionConfig functionConfig;
    /**
     * <p>
     * Contains metadata about a CloudFront function.
     * </p>
     */
    private FunctionMetadata functionMetadata;

    /**
     * <p>
     * The name of the CloudFront function.
     * </p>
     * 
     * @param name
     *        The name of the CloudFront function.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the CloudFront function.
     * </p>
     * 
     * @return The name of the CloudFront function.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the CloudFront function.
     * </p>
     * 
     * @param name
     *        The name of the CloudFront function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the CloudFront function.
     * </p>
     * 
     * @param status
     *        The status of the CloudFront function.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the CloudFront function.
     * </p>
     * 
     * @return The status of the CloudFront function.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the CloudFront function.
     * </p>
     * 
     * @param status
     *        The status of the CloudFront function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Contains configuration information about a CloudFront function.
     * </p>
     * 
     * @param functionConfig
     *        Contains configuration information about a CloudFront function.
     */

    public void setFunctionConfig(FunctionConfig functionConfig) {
        this.functionConfig = functionConfig;
    }

    /**
     * <p>
     * Contains configuration information about a CloudFront function.
     * </p>
     * 
     * @return Contains configuration information about a CloudFront function.
     */

    public FunctionConfig getFunctionConfig() {
        return this.functionConfig;
    }

    /**
     * <p>
     * Contains configuration information about a CloudFront function.
     * </p>
     * 
     * @param functionConfig
     *        Contains configuration information about a CloudFront function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionSummary withFunctionConfig(FunctionConfig functionConfig) {
        setFunctionConfig(functionConfig);
        return this;
    }

    /**
     * <p>
     * Contains metadata about a CloudFront function.
     * </p>
     * 
     * @param functionMetadata
     *        Contains metadata about a CloudFront function.
     */

    public void setFunctionMetadata(FunctionMetadata functionMetadata) {
        this.functionMetadata = functionMetadata;
    }

    /**
     * <p>
     * Contains metadata about a CloudFront function.
     * </p>
     * 
     * @return Contains metadata about a CloudFront function.
     */

    public FunctionMetadata getFunctionMetadata() {
        return this.functionMetadata;
    }

    /**
     * <p>
     * Contains metadata about a CloudFront function.
     * </p>
     * 
     * @param functionMetadata
     *        Contains metadata about a CloudFront function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionSummary withFunctionMetadata(FunctionMetadata functionMetadata) {
        setFunctionMetadata(functionMetadata);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFunctionConfig() != null)
            sb.append("FunctionConfig: ").append(getFunctionConfig()).append(",");
        if (getFunctionMetadata() != null)
            sb.append("FunctionMetadata: ").append(getFunctionMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionSummary == false)
            return false;
        FunctionSummary other = (FunctionSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFunctionConfig() == null ^ this.getFunctionConfig() == null)
            return false;
        if (other.getFunctionConfig() != null && other.getFunctionConfig().equals(this.getFunctionConfig()) == false)
            return false;
        if (other.getFunctionMetadata() == null ^ this.getFunctionMetadata() == null)
            return false;
        if (other.getFunctionMetadata() != null && other.getFunctionMetadata().equals(this.getFunctionMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFunctionConfig() == null) ? 0 : getFunctionConfig().hashCode());
        hashCode = prime * hashCode + ((getFunctionMetadata() == null) ? 0 : getFunctionMetadata().hashCode());
        return hashCode;
    }

    @Override
    public FunctionSummary clone() {
        try {
            return (FunctionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
