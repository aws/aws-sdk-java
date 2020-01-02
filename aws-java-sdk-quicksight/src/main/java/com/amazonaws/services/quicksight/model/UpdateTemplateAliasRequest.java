/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplateAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTemplateAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that contains the template alias that you're updating.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the template.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * The alias of the template that you want to update. If you name a specific alias, you update the version that the
     * alias points to. You can specify the latest version of the template by providing the keyword <code>$LATEST</code>
     * in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't apply to templates.
     * </p>
     */
    private String aliasName;
    /**
     * <p>
     * The version number of the template.
     * </p>
     */
    private Long templateVersionNumber;

    /**
     * <p>
     * The ID of the AWS account that contains the template alias that you're updating.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the template alias that you're updating.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template alias that you're updating.
     * </p>
     * 
     * @return The ID of the AWS account that contains the template alias that you're updating.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template alias that you're updating.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the template alias that you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateAliasRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the template.
     * </p>
     * 
     * @param templateId
     *        The ID for the template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID for the template.
     * </p>
     * 
     * @return The ID for the template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The ID for the template.
     * </p>
     * 
     * @param templateId
     *        The ID for the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateAliasRequest withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * The alias of the template that you want to update. If you name a specific alias, you update the version that the
     * alias points to. You can specify the latest version of the template by providing the keyword <code>$LATEST</code>
     * in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't apply to templates.
     * </p>
     * 
     * @param aliasName
     *        The alias of the template that you want to update. If you name a specific alias, you update the version
     *        that the alias points to. You can specify the latest version of the template by providing the keyword
     *        <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't
     *        apply to templates.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The alias of the template that you want to update. If you name a specific alias, you update the version that the
     * alias points to. You can specify the latest version of the template by providing the keyword <code>$LATEST</code>
     * in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't apply to templates.
     * </p>
     * 
     * @return The alias of the template that you want to update. If you name a specific alias, you update the version
     *         that the alias points to. You can specify the latest version of the template by providing the keyword
     *         <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't
     *         apply to templates.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * The alias of the template that you want to update. If you name a specific alias, you update the version that the
     * alias points to. You can specify the latest version of the template by providing the keyword <code>$LATEST</code>
     * in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't apply to templates.
     * </p>
     * 
     * @param aliasName
     *        The alias of the template that you want to update. If you name a specific alias, you update the version
     *        that the alias points to. You can specify the latest version of the template by providing the keyword
     *        <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't
     *        apply to templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateAliasRequest withAliasName(String aliasName) {
        setAliasName(aliasName);
        return this;
    }

    /**
     * <p>
     * The version number of the template.
     * </p>
     * 
     * @param templateVersionNumber
     *        The version number of the template.
     */

    public void setTemplateVersionNumber(Long templateVersionNumber) {
        this.templateVersionNumber = templateVersionNumber;
    }

    /**
     * <p>
     * The version number of the template.
     * </p>
     * 
     * @return The version number of the template.
     */

    public Long getTemplateVersionNumber() {
        return this.templateVersionNumber;
    }

    /**
     * <p>
     * The version number of the template.
     * </p>
     * 
     * @param templateVersionNumber
     *        The version number of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateAliasRequest withTemplateVersionNumber(Long templateVersionNumber) {
        setTemplateVersionNumber(templateVersionNumber);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getAliasName() != null)
            sb.append("AliasName: ").append(getAliasName()).append(",");
        if (getTemplateVersionNumber() != null)
            sb.append("TemplateVersionNumber: ").append(getTemplateVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTemplateAliasRequest == false)
            return false;
        UpdateTemplateAliasRequest other = (UpdateTemplateAliasRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        if (other.getTemplateVersionNumber() == null ^ this.getTemplateVersionNumber() == null)
            return false;
        if (other.getTemplateVersionNumber() != null && other.getTemplateVersionNumber().equals(this.getTemplateVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        hashCode = prime * hashCode + ((getTemplateVersionNumber() == null) ? 0 : getTemplateVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTemplateAliasRequest clone() {
        return (UpdateTemplateAliasRequest) super.clone();
    }

}
