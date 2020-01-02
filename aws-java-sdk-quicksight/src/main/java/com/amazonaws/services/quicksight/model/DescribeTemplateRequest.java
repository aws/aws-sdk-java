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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're describing.
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
     * (Optional) The number for the version to describe. If a <code>VersionNumber</code> parameter value isn't
     * provided, the latest version of the template is described.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The alias of the template that you want to describe. If you name a specific alias, you describe the version that
     * the alias points to. You can specify the latest version of the template by providing the keyword
     * <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't apply
     * to templates.
     * </p>
     */
    private String aliasName;

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're describing.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the template that you're describing.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're describing.
     * </p>
     * 
     * @return The ID of the AWS account that contains the template that you're describing.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're describing.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the template that you're describing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateRequest withAwsAccountId(String awsAccountId) {
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

    public DescribeTemplateRequest withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * (Optional) The number for the version to describe. If a <code>VersionNumber</code> parameter value isn't
     * provided, the latest version of the template is described.
     * </p>
     * 
     * @param versionNumber
     *        (Optional) The number for the version to describe. If a <code>VersionNumber</code> parameter value isn't
     *        provided, the latest version of the template is described.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * (Optional) The number for the version to describe. If a <code>VersionNumber</code> parameter value isn't
     * provided, the latest version of the template is described.
     * </p>
     * 
     * @return (Optional) The number for the version to describe. If a <code>VersionNumber</code> parameter value isn't
     *         provided, the latest version of the template is described.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * (Optional) The number for the version to describe. If a <code>VersionNumber</code> parameter value isn't
     * provided, the latest version of the template is described.
     * </p>
     * 
     * @param versionNumber
     *        (Optional) The number for the version to describe. If a <code>VersionNumber</code> parameter value isn't
     *        provided, the latest version of the template is described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateRequest withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The alias of the template that you want to describe. If you name a specific alias, you describe the version that
     * the alias points to. You can specify the latest version of the template by providing the keyword
     * <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't apply
     * to templates.
     * </p>
     * 
     * @param aliasName
     *        The alias of the template that you want to describe. If you name a specific alias, you describe the
     *        version that the alias points to. You can specify the latest version of the template by providing the
     *        keyword <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code>
     *        doesn't apply to templates.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The alias of the template that you want to describe. If you name a specific alias, you describe the version that
     * the alias points to. You can specify the latest version of the template by providing the keyword
     * <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't apply
     * to templates.
     * </p>
     * 
     * @return The alias of the template that you want to describe. If you name a specific alias, you describe the
     *         version that the alias points to. You can specify the latest version of the template by providing the
     *         keyword <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code>
     *         doesn't apply to templates.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * The alias of the template that you want to describe. If you name a specific alias, you describe the version that
     * the alias points to. You can specify the latest version of the template by providing the keyword
     * <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't apply
     * to templates.
     * </p>
     * 
     * @param aliasName
     *        The alias of the template that you want to describe. If you name a specific alias, you describe the
     *        version that the alias points to. You can specify the latest version of the template by providing the
     *        keyword <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code>
     *        doesn't apply to templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateRequest withAliasName(String aliasName) {
        setAliasName(aliasName);
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
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getAliasName() != null)
            sb.append("AliasName: ").append(getAliasName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTemplateRequest == false)
            return false;
        DescribeTemplateRequest other = (DescribeTemplateRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTemplateRequest clone() {
        return (DescribeTemplateRequest) super.clone();
    }

}
