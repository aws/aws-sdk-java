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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The keyword to search for in AWS CloudTrail logs, AWS Config rules, AWS Security Hub checks, and AWS API names.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/SourceKeyword" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceKeyword implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The method of input for the specified keyword.
     * </p>
     */
    private String keywordInputType;
    /**
     * <p>
     * The value of the keyword used to search AWS CloudTrail logs, AWS Config rules, AWS Security Hub checks, and AWS
     * API names when mapping a control data source.
     * </p>
     */
    private String keywordValue;

    /**
     * <p>
     * The method of input for the specified keyword.
     * </p>
     * 
     * @param keywordInputType
     *        The method of input for the specified keyword.
     * @see KeywordInputType
     */

    public void setKeywordInputType(String keywordInputType) {
        this.keywordInputType = keywordInputType;
    }

    /**
     * <p>
     * The method of input for the specified keyword.
     * </p>
     * 
     * @return The method of input for the specified keyword.
     * @see KeywordInputType
     */

    public String getKeywordInputType() {
        return this.keywordInputType;
    }

    /**
     * <p>
     * The method of input for the specified keyword.
     * </p>
     * 
     * @param keywordInputType
     *        The method of input for the specified keyword.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeywordInputType
     */

    public SourceKeyword withKeywordInputType(String keywordInputType) {
        setKeywordInputType(keywordInputType);
        return this;
    }

    /**
     * <p>
     * The method of input for the specified keyword.
     * </p>
     * 
     * @param keywordInputType
     *        The method of input for the specified keyword.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeywordInputType
     */

    public SourceKeyword withKeywordInputType(KeywordInputType keywordInputType) {
        this.keywordInputType = keywordInputType.toString();
        return this;
    }

    /**
     * <p>
     * The value of the keyword used to search AWS CloudTrail logs, AWS Config rules, AWS Security Hub checks, and AWS
     * API names when mapping a control data source.
     * </p>
     * 
     * @param keywordValue
     *        The value of the keyword used to search AWS CloudTrail logs, AWS Config rules, AWS Security Hub checks,
     *        and AWS API names when mapping a control data source.
     */

    public void setKeywordValue(String keywordValue) {
        this.keywordValue = keywordValue;
    }

    /**
     * <p>
     * The value of the keyword used to search AWS CloudTrail logs, AWS Config rules, AWS Security Hub checks, and AWS
     * API names when mapping a control data source.
     * </p>
     * 
     * @return The value of the keyword used to search AWS CloudTrail logs, AWS Config rules, AWS Security Hub checks,
     *         and AWS API names when mapping a control data source.
     */

    public String getKeywordValue() {
        return this.keywordValue;
    }

    /**
     * <p>
     * The value of the keyword used to search AWS CloudTrail logs, AWS Config rules, AWS Security Hub checks, and AWS
     * API names when mapping a control data source.
     * </p>
     * 
     * @param keywordValue
     *        The value of the keyword used to search AWS CloudTrail logs, AWS Config rules, AWS Security Hub checks,
     *        and AWS API names when mapping a control data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceKeyword withKeywordValue(String keywordValue) {
        setKeywordValue(keywordValue);
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
        if (getKeywordInputType() != null)
            sb.append("KeywordInputType: ").append(getKeywordInputType()).append(",");
        if (getKeywordValue() != null)
            sb.append("KeywordValue: ").append(getKeywordValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceKeyword == false)
            return false;
        SourceKeyword other = (SourceKeyword) obj;
        if (other.getKeywordInputType() == null ^ this.getKeywordInputType() == null)
            return false;
        if (other.getKeywordInputType() != null && other.getKeywordInputType().equals(this.getKeywordInputType()) == false)
            return false;
        if (other.getKeywordValue() == null ^ this.getKeywordValue() == null)
            return false;
        if (other.getKeywordValue() != null && other.getKeywordValue().equals(this.getKeywordValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeywordInputType() == null) ? 0 : getKeywordInputType().hashCode());
        hashCode = prime * hashCode + ((getKeywordValue() == null) ? 0 : getKeywordValue().hashCode());
        return hashCode;
    }

    @Override
    public SourceKeyword clone() {
        try {
            return (SourceKeyword) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.SourceKeywordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
