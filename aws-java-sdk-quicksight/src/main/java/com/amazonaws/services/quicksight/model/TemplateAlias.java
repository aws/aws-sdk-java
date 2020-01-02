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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The template alias.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TemplateAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateAlias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display name of the template alias.
     * </p>
     */
    private String aliasName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template alias.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The version number of the template alias.
     * </p>
     */
    private Long templateVersionNumber;

    /**
     * <p>
     * The display name of the template alias.
     * </p>
     * 
     * @param aliasName
     *        The display name of the template alias.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The display name of the template alias.
     * </p>
     * 
     * @return The display name of the template alias.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * The display name of the template alias.
     * </p>
     * 
     * @param aliasName
     *        The display name of the template alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateAlias withAliasName(String aliasName) {
        setAliasName(aliasName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template alias.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the template alias.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template alias.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the template alias.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template alias.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the template alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateAlias withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The version number of the template alias.
     * </p>
     * 
     * @param templateVersionNumber
     *        The version number of the template alias.
     */

    public void setTemplateVersionNumber(Long templateVersionNumber) {
        this.templateVersionNumber = templateVersionNumber;
    }

    /**
     * <p>
     * The version number of the template alias.
     * </p>
     * 
     * @return The version number of the template alias.
     */

    public Long getTemplateVersionNumber() {
        return this.templateVersionNumber;
    }

    /**
     * <p>
     * The version number of the template alias.
     * </p>
     * 
     * @param templateVersionNumber
     *        The version number of the template alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateAlias withTemplateVersionNumber(Long templateVersionNumber) {
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
        if (getAliasName() != null)
            sb.append("AliasName: ").append(getAliasName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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

        if (obj instanceof TemplateAlias == false)
            return false;
        TemplateAlias other = (TemplateAlias) obj;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateVersionNumber() == null) ? 0 : getTemplateVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public TemplateAlias clone() {
        try {
            return (TemplateAlias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TemplateAliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
