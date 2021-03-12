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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The HTTP package configuration properties for the requested VOD source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/HttpPackageConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpPackageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The relative path to the URL for this VOD source. This is combined with
     * SourceLocation::HttpConfiguration::BaseUrl to form a valid URL.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The name of the source group. This has to match one of the Channel::Outputs::SourceGroup.
     * </p>
     */
    private String sourceGroup;
    /**
     * <p>
     * The streaming protocol for this package configuration. Supported values are HLS and DASH.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The relative path to the URL for this VOD source. This is combined with
     * SourceLocation::HttpConfiguration::BaseUrl to form a valid URL.
     * </p>
     * 
     * @param path
     *        The relative path to the URL for this VOD source. This is combined with
     *        SourceLocation::HttpConfiguration::BaseUrl to form a valid URL.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The relative path to the URL for this VOD source. This is combined with
     * SourceLocation::HttpConfiguration::BaseUrl to form a valid URL.
     * </p>
     * 
     * @return The relative path to the URL for this VOD source. This is combined with
     *         SourceLocation::HttpConfiguration::BaseUrl to form a valid URL.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The relative path to the URL for this VOD source. This is combined with
     * SourceLocation::HttpConfiguration::BaseUrl to form a valid URL.
     * </p>
     * 
     * @param path
     *        The relative path to the URL for this VOD source. This is combined with
     *        SourceLocation::HttpConfiguration::BaseUrl to form a valid URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpPackageConfiguration withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The name of the source group. This has to match one of the Channel::Outputs::SourceGroup.
     * </p>
     * 
     * @param sourceGroup
     *        The name of the source group. This has to match one of the Channel::Outputs::SourceGroup.
     */

    public void setSourceGroup(String sourceGroup) {
        this.sourceGroup = sourceGroup;
    }

    /**
     * <p>
     * The name of the source group. This has to match one of the Channel::Outputs::SourceGroup.
     * </p>
     * 
     * @return The name of the source group. This has to match one of the Channel::Outputs::SourceGroup.
     */

    public String getSourceGroup() {
        return this.sourceGroup;
    }

    /**
     * <p>
     * The name of the source group. This has to match one of the Channel::Outputs::SourceGroup.
     * </p>
     * 
     * @param sourceGroup
     *        The name of the source group. This has to match one of the Channel::Outputs::SourceGroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpPackageConfiguration withSourceGroup(String sourceGroup) {
        setSourceGroup(sourceGroup);
        return this;
    }

    /**
     * <p>
     * The streaming protocol for this package configuration. Supported values are HLS and DASH.
     * </p>
     * 
     * @param type
     *        The streaming protocol for this package configuration. Supported values are HLS and DASH.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The streaming protocol for this package configuration. Supported values are HLS and DASH.
     * </p>
     * 
     * @return The streaming protocol for this package configuration. Supported values are HLS and DASH.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The streaming protocol for this package configuration. Supported values are HLS and DASH.
     * </p>
     * 
     * @param type
     *        The streaming protocol for this package configuration. Supported values are HLS and DASH.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public HttpPackageConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The streaming protocol for this package configuration. Supported values are HLS and DASH.
     * </p>
     * 
     * @param type
     *        The streaming protocol for this package configuration. Supported values are HLS and DASH.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public HttpPackageConfiguration withType(Type type) {
        this.type = type.toString();
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getSourceGroup() != null)
            sb.append("SourceGroup: ").append(getSourceGroup()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpPackageConfiguration == false)
            return false;
        HttpPackageConfiguration other = (HttpPackageConfiguration) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getSourceGroup() == null ^ this.getSourceGroup() == null)
            return false;
        if (other.getSourceGroup() != null && other.getSourceGroup().equals(this.getSourceGroup()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getSourceGroup() == null) ? 0 : getSourceGroup().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public HttpPackageConfiguration clone() {
        try {
            return (HttpPackageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.HttpPackageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
