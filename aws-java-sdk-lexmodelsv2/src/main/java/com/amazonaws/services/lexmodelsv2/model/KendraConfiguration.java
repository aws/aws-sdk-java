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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration information for the AMAZON.KendraSearchIntent intent. When you use this intent, Amazon Lex
 * searches the specified Amazon Kendra index and returns documents from the index that match the user's utterance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/KendraConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KendraConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent intent to
     * search. The index must be in the same account and Region as the Amazon Lex bot.
     * </p>
     */
    private String kendraIndex;
    /**
     * <p>
     * Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon Kendra
     * index.
     * </p>
     */
    private Boolean queryFilterStringEnabled;
    /**
     * <p>
     * A query filter that Amazon Lex sends to Amazon Kendra to filter the response from a query. The filter is in the
     * format defined by Amazon Kendra. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.
     * </p>
     */
    private String queryFilterString;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent intent to
     * search. The index must be in the same account and Region as the Amazon Lex bot.
     * </p>
     * 
     * @param kendraIndex
     *        The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent
     *        intent to search. The index must be in the same account and Region as the Amazon Lex bot.
     */

    public void setKendraIndex(String kendraIndex) {
        this.kendraIndex = kendraIndex;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent intent to
     * search. The index must be in the same account and Region as the Amazon Lex bot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent
     *         intent to search. The index must be in the same account and Region as the Amazon Lex bot.
     */

    public String getKendraIndex() {
        return this.kendraIndex;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent intent to
     * search. The index must be in the same account and Region as the Amazon Lex bot.
     * </p>
     * 
     * @param kendraIndex
     *        The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent
     *        intent to search. The index must be in the same account and Region as the Amazon Lex bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KendraConfiguration withKendraIndex(String kendraIndex) {
        setKendraIndex(kendraIndex);
        return this;
    }

    /**
     * <p>
     * Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon Kendra
     * index.
     * </p>
     * 
     * @param queryFilterStringEnabled
     *        Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon
     *        Kendra index.
     */

    public void setQueryFilterStringEnabled(Boolean queryFilterStringEnabled) {
        this.queryFilterStringEnabled = queryFilterStringEnabled;
    }

    /**
     * <p>
     * Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon Kendra
     * index.
     * </p>
     * 
     * @return Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon
     *         Kendra index.
     */

    public Boolean getQueryFilterStringEnabled() {
        return this.queryFilterStringEnabled;
    }

    /**
     * <p>
     * Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon Kendra
     * index.
     * </p>
     * 
     * @param queryFilterStringEnabled
     *        Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon
     *        Kendra index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KendraConfiguration withQueryFilterStringEnabled(Boolean queryFilterStringEnabled) {
        setQueryFilterStringEnabled(queryFilterStringEnabled);
        return this;
    }

    /**
     * <p>
     * Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon Kendra
     * index.
     * </p>
     * 
     * @return Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon
     *         Kendra index.
     */

    public Boolean isQueryFilterStringEnabled() {
        return this.queryFilterStringEnabled;
    }

    /**
     * <p>
     * A query filter that Amazon Lex sends to Amazon Kendra to filter the response from a query. The filter is in the
     * format defined by Amazon Kendra. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.
     * </p>
     * 
     * @param queryFilterString
     *        A query filter that Amazon Lex sends to Amazon Kendra to filter the response from a query. The filter is
     *        in the format defined by Amazon Kendra. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.
     */

    public void setQueryFilterString(String queryFilterString) {
        this.queryFilterString = queryFilterString;
    }

    /**
     * <p>
     * A query filter that Amazon Lex sends to Amazon Kendra to filter the response from a query. The filter is in the
     * format defined by Amazon Kendra. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.
     * </p>
     * 
     * @return A query filter that Amazon Lex sends to Amazon Kendra to filter the response from a query. The filter is
     *         in the format defined by Amazon Kendra. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.
     */

    public String getQueryFilterString() {
        return this.queryFilterString;
    }

    /**
     * <p>
     * A query filter that Amazon Lex sends to Amazon Kendra to filter the response from a query. The filter is in the
     * format defined by Amazon Kendra. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.
     * </p>
     * 
     * @param queryFilterString
     *        A query filter that Amazon Lex sends to Amazon Kendra to filter the response from a query. The filter is
     *        in the format defined by Amazon Kendra. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html">Filtering queries</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KendraConfiguration withQueryFilterString(String queryFilterString) {
        setQueryFilterString(queryFilterString);
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
        if (getQueryFilterStringEnabled() != null)
            sb.append("QueryFilterStringEnabled: ").append(getQueryFilterStringEnabled()).append(",");
        if (getQueryFilterString() != null)
            sb.append("QueryFilterString: ").append(getQueryFilterString());
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
        if (other.getQueryFilterStringEnabled() == null ^ this.getQueryFilterStringEnabled() == null)
            return false;
        if (other.getQueryFilterStringEnabled() != null && other.getQueryFilterStringEnabled().equals(this.getQueryFilterStringEnabled()) == false)
            return false;
        if (other.getQueryFilterString() == null ^ this.getQueryFilterString() == null)
            return false;
        if (other.getQueryFilterString() != null && other.getQueryFilterString().equals(this.getQueryFilterString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKendraIndex() == null) ? 0 : getKendraIndex().hashCode());
        hashCode = prime * hashCode + ((getQueryFilterStringEnabled() == null) ? 0 : getQueryFilterStringEnabled().hashCode());
        hashCode = prime * hashCode + ((getQueryFilterString() == null) ? 0 : getQueryFilterString().hashCode());
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
        com.amazonaws.services.lexmodelsv2.model.transform.KendraConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
