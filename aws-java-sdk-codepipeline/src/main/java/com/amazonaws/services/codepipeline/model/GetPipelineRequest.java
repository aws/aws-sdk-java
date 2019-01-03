/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a GetPipeline action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetPipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline for which you want to get information. Pipeline names must be unique under an Amazon Web
     * Services (AWS) user account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version number of the pipeline. If you do not specify a version, defaults to the most current version.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The name of the pipeline for which you want to get information. Pipeline names must be unique under an Amazon Web
     * Services (AWS) user account.
     * </p>
     * 
     * @param name
     *        The name of the pipeline for which you want to get information. Pipeline names must be unique under an
     *        Amazon Web Services (AWS) user account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pipeline for which you want to get information. Pipeline names must be unique under an Amazon Web
     * Services (AWS) user account.
     * </p>
     * 
     * @return The name of the pipeline for which you want to get information. Pipeline names must be unique under an
     *         Amazon Web Services (AWS) user account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pipeline for which you want to get information. Pipeline names must be unique under an Amazon Web
     * Services (AWS) user account.
     * </p>
     * 
     * @param name
     *        The name of the pipeline for which you want to get information. Pipeline names must be unique under an
     *        Amazon Web Services (AWS) user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version number of the pipeline. If you do not specify a version, defaults to the most current version.
     * </p>
     * 
     * @param version
     *        The version number of the pipeline. If you do not specify a version, defaults to the most current version.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the pipeline. If you do not specify a version, defaults to the most current version.
     * </p>
     * 
     * @return The version number of the pipeline. If you do not specify a version, defaults to the most current
     *         version.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the pipeline. If you do not specify a version, defaults to the most current version.
     * </p>
     * 
     * @param version
     *        The version number of the pipeline. If you do not specify a version, defaults to the most current version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineRequest withVersion(Integer version) {
        setVersion(version);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPipelineRequest == false)
            return false;
        GetPipelineRequest other = (GetPipelineRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetPipelineRequest clone() {
        return (GetPipelineRequest) super.clone();
    }

}
