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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTemplateAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTemplateAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that contains the item to delete.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the template that the specified alias is for.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * The name for the template alias. If you name a specific alias, you delete the version that the alias points to.
     * You can specify the latest version of the template by providing the keyword <code>$LATEST</code> in the
     * <code>AliasName</code> parameter.
     * </p>
     */
    private String aliasName;

    /**
     * <p>
     * The ID of the AWS account that contains the item to delete.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the item to delete.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the item to delete.
     * </p>
     * 
     * @return The ID of the AWS account that contains the item to delete.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the item to delete.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the item to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTemplateAliasRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the template that the specified alias is for.
     * </p>
     * 
     * @param templateId
     *        The ID for the template that the specified alias is for.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID for the template that the specified alias is for.
     * </p>
     * 
     * @return The ID for the template that the specified alias is for.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The ID for the template that the specified alias is for.
     * </p>
     * 
     * @param templateId
     *        The ID for the template that the specified alias is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTemplateAliasRequest withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * The name for the template alias. If you name a specific alias, you delete the version that the alias points to.
     * You can specify the latest version of the template by providing the keyword <code>$LATEST</code> in the
     * <code>AliasName</code> parameter.
     * </p>
     * 
     * @param aliasName
     *        The name for the template alias. If you name a specific alias, you delete the version that the alias
     *        points to. You can specify the latest version of the template by providing the keyword
     *        <code>$LATEST</code> in the <code>AliasName</code> parameter.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The name for the template alias. If you name a specific alias, you delete the version that the alias points to.
     * You can specify the latest version of the template by providing the keyword <code>$LATEST</code> in the
     * <code>AliasName</code> parameter.
     * </p>
     * 
     * @return The name for the template alias. If you name a specific alias, you delete the version that the alias
     *         points to. You can specify the latest version of the template by providing the keyword
     *         <code>$LATEST</code> in the <code>AliasName</code> parameter.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * The name for the template alias. If you name a specific alias, you delete the version that the alias points to.
     * You can specify the latest version of the template by providing the keyword <code>$LATEST</code> in the
     * <code>AliasName</code> parameter.
     * </p>
     * 
     * @param aliasName
     *        The name for the template alias. If you name a specific alias, you delete the version that the alias
     *        points to. You can specify the latest version of the template by providing the keyword
     *        <code>$LATEST</code> in the <code>AliasName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTemplateAliasRequest withAliasName(String aliasName) {
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

        if (obj instanceof DeleteTemplateAliasRequest == false)
            return false;
        DeleteTemplateAliasRequest other = (DeleteTemplateAliasRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTemplateAliasRequest clone() {
        return (DeleteTemplateAliasRequest) super.clone();
    }

}
