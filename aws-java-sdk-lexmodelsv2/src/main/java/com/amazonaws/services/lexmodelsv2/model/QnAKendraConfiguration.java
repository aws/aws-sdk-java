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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the configuration of the Amazon Kendra index used for the <code>AMAZON.QnAIntent</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/QnAKendraConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QnAKendraConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Amazon Kendra index to use.
     * </p>
     */
    private String kendraIndex;
    /**
     * <p>
     * Specifies whether to enable an Amazon Kendra filter string or not.
     * </p>
     */
    private Boolean queryFilterStringEnabled;
    /**
     * <p>
     * Contains the Amazon Kendra filter string to use if enabled. For more information on the Amazon Kendra search
     * filter JSON format, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html#search-filtering">Using document attributes to
     * filter search results</a>.
     * </p>
     */
    private String queryFilterString;
    /**
     * <p>
     * Specifies whether to return an exact response from the Amazon Kendra index or to let the Amazon Bedrock model you
     * select generate a response based on the results. To use this feature, you must first add FAQ questions to your
     * index by following the steps at <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding frequently asked questions (FAQs)
     * to an index</a>.
     * </p>
     */
    private Boolean exactResponse;

    /**
     * <p>
     * The ARN of the Amazon Kendra index to use.
     * </p>
     * 
     * @param kendraIndex
     *        The ARN of the Amazon Kendra index to use.
     */

    public void setKendraIndex(String kendraIndex) {
        this.kendraIndex = kendraIndex;
    }

    /**
     * <p>
     * The ARN of the Amazon Kendra index to use.
     * </p>
     * 
     * @return The ARN of the Amazon Kendra index to use.
     */

    public String getKendraIndex() {
        return this.kendraIndex;
    }

    /**
     * <p>
     * The ARN of the Amazon Kendra index to use.
     * </p>
     * 
     * @param kendraIndex
     *        The ARN of the Amazon Kendra index to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QnAKendraConfiguration withKendraIndex(String kendraIndex) {
        setKendraIndex(kendraIndex);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable an Amazon Kendra filter string or not.
     * </p>
     * 
     * @param queryFilterStringEnabled
     *        Specifies whether to enable an Amazon Kendra filter string or not.
     */

    public void setQueryFilterStringEnabled(Boolean queryFilterStringEnabled) {
        this.queryFilterStringEnabled = queryFilterStringEnabled;
    }

    /**
     * <p>
     * Specifies whether to enable an Amazon Kendra filter string or not.
     * </p>
     * 
     * @return Specifies whether to enable an Amazon Kendra filter string or not.
     */

    public Boolean getQueryFilterStringEnabled() {
        return this.queryFilterStringEnabled;
    }

    /**
     * <p>
     * Specifies whether to enable an Amazon Kendra filter string or not.
     * </p>
     * 
     * @param queryFilterStringEnabled
     *        Specifies whether to enable an Amazon Kendra filter string or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QnAKendraConfiguration withQueryFilterStringEnabled(Boolean queryFilterStringEnabled) {
        setQueryFilterStringEnabled(queryFilterStringEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable an Amazon Kendra filter string or not.
     * </p>
     * 
     * @return Specifies whether to enable an Amazon Kendra filter string or not.
     */

    public Boolean isQueryFilterStringEnabled() {
        return this.queryFilterStringEnabled;
    }

    /**
     * <p>
     * Contains the Amazon Kendra filter string to use if enabled. For more information on the Amazon Kendra search
     * filter JSON format, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html#search-filtering">Using document attributes to
     * filter search results</a>.
     * </p>
     * 
     * @param queryFilterString
     *        Contains the Amazon Kendra filter string to use if enabled. For more information on the Amazon Kendra
     *        search filter JSON format, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html#search-filtering">Using document
     *        attributes to filter search results</a>.
     */

    public void setQueryFilterString(String queryFilterString) {
        this.queryFilterString = queryFilterString;
    }

    /**
     * <p>
     * Contains the Amazon Kendra filter string to use if enabled. For more information on the Amazon Kendra search
     * filter JSON format, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html#search-filtering">Using document attributes to
     * filter search results</a>.
     * </p>
     * 
     * @return Contains the Amazon Kendra filter string to use if enabled. For more information on the Amazon Kendra
     *         search filter JSON format, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html#search-filtering">Using document
     *         attributes to filter search results</a>.
     */

    public String getQueryFilterString() {
        return this.queryFilterString;
    }

    /**
     * <p>
     * Contains the Amazon Kendra filter string to use if enabled. For more information on the Amazon Kendra search
     * filter JSON format, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html#search-filtering">Using document attributes to
     * filter search results</a>.
     * </p>
     * 
     * @param queryFilterString
     *        Contains the Amazon Kendra filter string to use if enabled. For more information on the Amazon Kendra
     *        search filter JSON format, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/filtering.html#search-filtering">Using document
     *        attributes to filter search results</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QnAKendraConfiguration withQueryFilterString(String queryFilterString) {
        setQueryFilterString(queryFilterString);
        return this;
    }

    /**
     * <p>
     * Specifies whether to return an exact response from the Amazon Kendra index or to let the Amazon Bedrock model you
     * select generate a response based on the results. To use this feature, you must first add FAQ questions to your
     * index by following the steps at <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding frequently asked questions (FAQs)
     * to an index</a>.
     * </p>
     * 
     * @param exactResponse
     *        Specifies whether to return an exact response from the Amazon Kendra index or to let the Amazon Bedrock
     *        model you select generate a response based on the results. To use this feature, you must first add FAQ
     *        questions to your index by following the steps at <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding frequently asked questions
     *        (FAQs) to an index</a>.
     */

    public void setExactResponse(Boolean exactResponse) {
        this.exactResponse = exactResponse;
    }

    /**
     * <p>
     * Specifies whether to return an exact response from the Amazon Kendra index or to let the Amazon Bedrock model you
     * select generate a response based on the results. To use this feature, you must first add FAQ questions to your
     * index by following the steps at <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding frequently asked questions (FAQs)
     * to an index</a>.
     * </p>
     * 
     * @return Specifies whether to return an exact response from the Amazon Kendra index or to let the Amazon Bedrock
     *         model you select generate a response based on the results. To use this feature, you must first add FAQ
     *         questions to your index by following the steps at <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding frequently asked
     *         questions (FAQs) to an index</a>.
     */

    public Boolean getExactResponse() {
        return this.exactResponse;
    }

    /**
     * <p>
     * Specifies whether to return an exact response from the Amazon Kendra index or to let the Amazon Bedrock model you
     * select generate a response based on the results. To use this feature, you must first add FAQ questions to your
     * index by following the steps at <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding frequently asked questions (FAQs)
     * to an index</a>.
     * </p>
     * 
     * @param exactResponse
     *        Specifies whether to return an exact response from the Amazon Kendra index or to let the Amazon Bedrock
     *        model you select generate a response based on the results. To use this feature, you must first add FAQ
     *        questions to your index by following the steps at <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding frequently asked questions
     *        (FAQs) to an index</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QnAKendraConfiguration withExactResponse(Boolean exactResponse) {
        setExactResponse(exactResponse);
        return this;
    }

    /**
     * <p>
     * Specifies whether to return an exact response from the Amazon Kendra index or to let the Amazon Bedrock model you
     * select generate a response based on the results. To use this feature, you must first add FAQ questions to your
     * index by following the steps at <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding frequently asked questions (FAQs)
     * to an index</a>.
     * </p>
     * 
     * @return Specifies whether to return an exact response from the Amazon Kendra index or to let the Amazon Bedrock
     *         model you select generate a response based on the results. To use this feature, you must first add FAQ
     *         questions to your index by following the steps at <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding frequently asked
     *         questions (FAQs) to an index</a>.
     */

    public Boolean isExactResponse() {
        return this.exactResponse;
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
            sb.append("QueryFilterString: ").append(getQueryFilterString()).append(",");
        if (getExactResponse() != null)
            sb.append("ExactResponse: ").append(getExactResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QnAKendraConfiguration == false)
            return false;
        QnAKendraConfiguration other = (QnAKendraConfiguration) obj;
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
        if (other.getExactResponse() == null ^ this.getExactResponse() == null)
            return false;
        if (other.getExactResponse() != null && other.getExactResponse().equals(this.getExactResponse()) == false)
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
        hashCode = prime * hashCode + ((getExactResponse() == null) ? 0 : getExactResponse().hashCode());
        return hashCode;
    }

    @Override
    public QnAKendraConfiguration clone() {
        try {
            return (QnAKendraConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.QnAKendraConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
