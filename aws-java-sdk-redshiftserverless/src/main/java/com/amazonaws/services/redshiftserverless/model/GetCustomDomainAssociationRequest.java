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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetCustomDomainAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCustomDomainAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The custom domain name associated with the workgroup.
     * </p>
     */
    private String customDomainName;
    /**
     * <p>
     * The name of the workgroup associated with the database.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * The custom domain name associated with the workgroup.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name associated with the workgroup.
     */

    public void setCustomDomainName(String customDomainName) {
        this.customDomainName = customDomainName;
    }

    /**
     * <p>
     * The custom domain name associated with the workgroup.
     * </p>
     * 
     * @return The custom domain name associated with the workgroup.
     */

    public String getCustomDomainName() {
        return this.customDomainName;
    }

    /**
     * <p>
     * The custom domain name associated with the workgroup.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name associated with the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDomainAssociationRequest withCustomDomainName(String customDomainName) {
        setCustomDomainName(customDomainName);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup associated with the database.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup associated with the database.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup associated with the database.
     * </p>
     * 
     * @return The name of the workgroup associated with the database.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup associated with the database.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup associated with the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDomainAssociationRequest withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
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
        if (getCustomDomainName() != null)
            sb.append("CustomDomainName: ").append(getCustomDomainName()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCustomDomainAssociationRequest == false)
            return false;
        GetCustomDomainAssociationRequest other = (GetCustomDomainAssociationRequest) obj;
        if (other.getCustomDomainName() == null ^ this.getCustomDomainName() == null)
            return false;
        if (other.getCustomDomainName() != null && other.getCustomDomainName().equals(this.getCustomDomainName()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomDomainName() == null) ? 0 : getCustomDomainName().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public GetCustomDomainAssociationRequest clone() {
        return (GetCustomDomainAssociationRequest) super.clone();
    }

}
