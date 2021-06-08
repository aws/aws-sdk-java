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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration information for the AMAZON.KendraSearchIntent intent. When you use this intent, Amazon Lex
 * searches the specified Amazon Kendra index and returns documents from the index that match the user's utterance. For
 * more information, see <a href="http://docs.aws.amazon.com/lex/latest/dg/built-in-intent-kendra-search.html">
 * AMAZON.KendraSearchIntent</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/KendraConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KendraConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent intent to
     * search. The index must be in the same account and Region as the Amazon Lex bot. If the Amazon Kendra index does
     * not exist, you get an exception when you call the <code>PutIntent</code> operation.
     * </p>
     */
    private String kendraIndex;
    /**
     * <p>
     * A query filter that Amazon Lex sends to Amazon Kendra to filter the response from the query. The filter is in the
     * format defined by Amazon Kendra. For more information, see <a
     * href="http://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.
     * </p>
     * <p>
     * You can override this filter string with a new filter string at runtime.
     * </p>
     */
    private String queryFilterString;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to search the Amazon Kendra index. The role
     * must be in the same account and Region as the Amazon Lex bot. If the role does not exist, you get an exception
     * when you call the <code>PutIntent</code> operation.
     * </p>
     */
    private String role;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent intent to
     * search. The index must be in the same account and Region as the Amazon Lex bot. If the Amazon Kendra index does
     * not exist, you get an exception when you call the <code>PutIntent</code> operation.
     * </p>
     * 
     * @param kendraIndex
     *        The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent
     *        intent to search. The index must be in the same account and Region as the Amazon Lex bot. If the Amazon
     *        Kendra index does not exist, you get an exception when you call the <code>PutIntent</code> operation.
     */

    public void setKendraIndex(String kendraIndex) {
        this.kendraIndex = kendraIndex;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent intent to
     * search. The index must be in the same account and Region as the Amazon Lex bot. If the Amazon Kendra index does
     * not exist, you get an exception when you call the <code>PutIntent</code> operation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent
     *         intent to search. The index must be in the same account and Region as the Amazon Lex bot. If the Amazon
     *         Kendra index does not exist, you get an exception when you call the <code>PutIntent</code> operation.
     */

    public String getKendraIndex() {
        return this.kendraIndex;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent intent to
     * search. The index must be in the same account and Region as the Amazon Lex bot. If the Amazon Kendra index does
     * not exist, you get an exception when you call the <code>PutIntent</code> operation.
     * </p>
     * 
     * @param kendraIndex
     *        The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent
     *        intent to search. The index must be in the same account and Region as the Amazon Lex bot. If the Amazon
     *        Kendra index does not exist, you get an exception when you call the <code>PutIntent</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KendraConfiguration withKendraIndex(String kendraIndex) {
        setKendraIndex(kendraIndex);
        return this;
    }

    /**
     * <p>
     * A query filter that Amazon Lex sends to Amazon Kendra to filter the response from the query. The filter is in the
     * format defined by Amazon Kendra. For more information, see <a
     * href="http://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.
     * </p>
     * <p>
     * You can override this filter string with a new filter string at runtime.
     * </p>
     * 
     * @param queryFilterString
     *        A query filter that Amazon Lex sends to Amazon Kendra to filter the response from the query. The filter is
     *        in the format defined by Amazon Kendra. For more information, see <a
     *        href="http://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.</p>
     *        <p>
     *        You can override this filter string with a new filter string at runtime.
     */

    public void setQueryFilterString(String queryFilterString) {
        this.queryFilterString = queryFilterString;
    }

    /**
     * <p>
     * A query filter that Amazon Lex sends to Amazon Kendra to filter the response from the query. The filter is in the
     * format defined by Amazon Kendra. For more information, see <a
     * href="http://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.
     * </p>
     * <p>
     * You can override this filter string with a new filter string at runtime.
     * </p>
     * 
     * @return A query filter that Amazon Lex sends to Amazon Kendra to filter the response from the query. The filter
     *         is in the format defined by Amazon Kendra. For more information, see <a
     *         href="http://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.</p>
     *         <p>
     *         You can override this filter string with a new filter string at runtime.
     */

    public String getQueryFilterString() {
        return this.queryFilterString;
    }

    /**
     * <p>
     * A query filter that Amazon Lex sends to Amazon Kendra to filter the response from the query. The filter is in the
     * format defined by Amazon Kendra. For more information, see <a
     * href="http://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.
     * </p>
     * <p>
     * You can override this filter string with a new filter string at runtime.
     * </p>
     * 
     * @param queryFilterString
     *        A query filter that Amazon Lex sends to Amazon Kendra to filter the response from the query. The filter is
     *        in the format defined by Amazon Kendra. For more information, see <a
     *        href="http://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.</p>
     *        <p>
     *        You can override this filter string with a new filter string at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KendraConfiguration withQueryFilterString(String queryFilterString) {
        setQueryFilterString(queryFilterString);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to search the Amazon Kendra index. The role
     * must be in the same account and Region as the Amazon Lex bot. If the role does not exist, you get an exception
     * when you call the <code>PutIntent</code> operation.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of an IAM role that has permission to search the Amazon Kendra index. The
     *        role must be in the same account and Region as the Amazon Lex bot. If the role does not exist, you get an
     *        exception when you call the <code>PutIntent</code> operation.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to search the Amazon Kendra index. The role
     * must be in the same account and Region as the Amazon Lex bot. If the role does not exist, you get an exception
     * when you call the <code>PutIntent</code> operation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that has permission to search the Amazon Kendra index. The
     *         role must be in the same account and Region as the Amazon Lex bot. If the role does not exist, you get an
     *         exception when you call the <code>PutIntent</code> operation.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to search the Amazon Kendra index. The role
     * must be in the same account and Region as the Amazon Lex bot. If the role does not exist, you get an exception
     * when you call the <code>PutIntent</code> operation.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of an IAM role that has permission to search the Amazon Kendra index. The
     *        role must be in the same account and Region as the Amazon Lex bot. If the role does not exist, you get an
     *        exception when you call the <code>PutIntent</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KendraConfiguration withRole(String role) {
        setRole(role);
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
        if (getKendraIndex() != null)
            sb.append("KendraIndex: ").append(getKendraIndex()).append(",");
        if (getQueryFilterString() != null)
            sb.append("QueryFilterString: ").append(getQueryFilterString()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KendraConfiguration == false)
            return false;
        KendraConfiguration other = (KendraConfiguration) obj;
        if (other.getKendraIndex() == null ^ this.getKendraIndex() == null)
            return false;
        if (other.getKendraIndex() != null && other.getKendraIndex().equals(this.getKendraIndex()) == false)
            return false;
        if (other.getQueryFilterString() == null ^ this.getQueryFilterString() == null)
            return false;
        if (other.getQueryFilterString() != null && other.getQueryFilterString().equals(this.getQueryFilterString()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKendraIndex() == null) ? 0 : getKendraIndex().hashCode());
        hashCode = prime * hashCode + ((getQueryFilterString() == null) ? 0 : getQueryFilterString().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public KendraConfiguration clone() {
        try {
            return (KendraConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.KendraConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
