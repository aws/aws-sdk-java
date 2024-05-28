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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteTemplateGroupAccessControlEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTemplateGroupAccessControlEntryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     * </p>
     */
    private String groupSecurityIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     */
    private String templateArn;

    /**
     * <p>
     * Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     * </p>
     * 
     * @param groupSecurityIdentifier
     *        Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     */

    public void setGroupSecurityIdentifier(String groupSecurityIdentifier) {
        this.groupSecurityIdentifier = groupSecurityIdentifier;
    }

    /**
     * <p>
     * Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     * </p>
     * 
     * @return Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     */

    public String getGroupSecurityIdentifier() {
        return this.groupSecurityIdentifier;
    }

    /**
     * <p>
     * Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     * </p>
     * 
     * @param groupSecurityIdentifier
     *        Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTemplateGroupAccessControlEntryRequest withGroupSecurityIdentifier(String groupSecurityIdentifier) {
        setGroupSecurityIdentifier(groupSecurityIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     * 
     * @param templateArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     *        >CreateTemplate</a>.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a
     *         href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     *         >CreateTemplate</a>.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     * 
     * @param templateArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     *        >CreateTemplate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTemplateGroupAccessControlEntryRequest withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
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
        if (getGroupSecurityIdentifier() != null)
            sb.append("GroupSecurityIdentifier: ").append(getGroupSecurityIdentifier()).append(",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTemplateGroupAccessControlEntryRequest == false)
            return false;
        DeleteTemplateGroupAccessControlEntryRequest other = (DeleteTemplateGroupAccessControlEntryRequest) obj;
        if (other.getGroupSecurityIdentifier() == null ^ this.getGroupSecurityIdentifier() == null)
            return false;
        if (other.getGroupSecurityIdentifier() != null && other.getGroupSecurityIdentifier().equals(this.getGroupSecurityIdentifier()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupSecurityIdentifier() == null) ? 0 : getGroupSecurityIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTemplateGroupAccessControlEntryRequest clone() {
        return (DeleteTemplateGroupAccessControlEntryRequest) super.clone();
    }

}
