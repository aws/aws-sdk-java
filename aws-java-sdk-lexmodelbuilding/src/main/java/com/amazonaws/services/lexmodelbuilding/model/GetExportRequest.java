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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bot to export.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the bot to export.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The type of resource to export.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The format of the exported data.
     * </p>
     */
    private String exportType;

    /**
     * <p>
     * The name of the bot to export.
     * </p>
     * 
     * @param name
     *        The name of the bot to export.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bot to export.
     * </p>
     * 
     * @return The name of the bot to export.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the bot to export.
     * </p>
     * 
     * @param name
     *        The name of the bot to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the bot to export.
     * </p>
     * 
     * @param version
     *        The version of the bot to export.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the bot to export.
     * </p>
     * 
     * @return The version of the bot to export.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the bot to export.
     * </p>
     * 
     * @param version
     *        The version of the bot to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The type of resource to export.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to export.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to export.
     * </p>
     * 
     * @return The type of resource to export.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource to export.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetExportRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource to export.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetExportRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * 
     * @param exportType
     *        The format of the exported data.
     * @see ExportType
     */

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * 
     * @return The format of the exported data.
     * @see ExportType
     */

    public String getExportType() {
        return this.exportType;
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * 
     * @param exportType
     *        The format of the exported data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportType
     */

    public GetExportRequest withExportType(String exportType) {
        setExportType(exportType);
        return this;
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * 
     * @param exportType
     *        The format of the exported data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportType
     */

    public GetExportRequest withExportType(ExportType exportType) {
        this.exportType = exportType.toString();
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
            sb.append("Version: ").append(getVersion()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getExportType() != null)
            sb.append("ExportType: ").append(getExportType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportRequest == false)
            return false;
        GetExportRequest other = (GetExportRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getExportType() == null ^ this.getExportType() == null)
            return false;
        if (other.getExportType() != null && other.getExportType().equals(this.getExportType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getExportType() == null) ? 0 : getExportType().hashCode());
        return hashCode;
    }

    @Override
    public GetExportRequest clone() {
        return (GetExportRequest) super.clone();
    }

}
