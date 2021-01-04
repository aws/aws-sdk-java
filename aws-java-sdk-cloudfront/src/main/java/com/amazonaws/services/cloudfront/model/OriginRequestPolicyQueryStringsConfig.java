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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An object that determines whether any URL query strings in viewer requests (and if so, which query strings) are
 * included in requests that CloudFront sends to the origin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/OriginRequestPolicyQueryStringsConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginRequestPolicyQueryStringsConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Determines whether any URL query strings in viewer requests are included in requests that CloudFront sends to the
     * origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Query strings in viewer requests are not included in requests that CloudFront sends to the
     * origin. Even when this field is set to <code>none</code>, any query strings that are listed in a
     * <code>CachePolicy</code> <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The query strings in viewer requests that are listed in the
     * <code>QueryStringNames</code> type are included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All query strings in viewer requests are included in requests that CloudFront sends to the
     * origin.
     * </p>
     * </li>
     * </ul>
     */
    private String queryStringBehavior;
    /**
     * <p>
     * Contains a list of the query strings in viewer requests that are included in requests that CloudFront sends to
     * the origin.
     * </p>
     */
    private QueryStringNames queryStrings;

    /**
     * <p>
     * Determines whether any URL query strings in viewer requests are included in requests that CloudFront sends to the
     * origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Query strings in viewer requests are not included in requests that CloudFront sends to the
     * origin. Even when this field is set to <code>none</code>, any query strings that are listed in a
     * <code>CachePolicy</code> <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The query strings in viewer requests that are listed in the
     * <code>QueryStringNames</code> type are included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All query strings in viewer requests are included in requests that CloudFront sends to the
     * origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @param queryStringBehavior
     *        Determines whether any URL query strings in viewer requests are included in requests that CloudFront sends
     *        to the origin. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>none</code> – Query strings in viewer requests are not included in requests that CloudFront sends to
     *        the origin. Even when this field is set to <code>none</code>, any query strings that are listed in a
     *        <code>CachePolicy</code> <i>are</i> included in origin requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>whitelist</code> – The query strings in viewer requests that are listed in the
     *        <code>QueryStringNames</code> type are included in requests that CloudFront sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> – All query strings in viewer requests are included in requests that CloudFront sends to
     *        the origin.
     *        </p>
     *        </li>
     * @see OriginRequestPolicyQueryStringBehavior
     */

    public void setQueryStringBehavior(String queryStringBehavior) {
        this.queryStringBehavior = queryStringBehavior;
    }

    /**
     * <p>
     * Determines whether any URL query strings in viewer requests are included in requests that CloudFront sends to the
     * origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Query strings in viewer requests are not included in requests that CloudFront sends to the
     * origin. Even when this field is set to <code>none</code>, any query strings that are listed in a
     * <code>CachePolicy</code> <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The query strings in viewer requests that are listed in the
     * <code>QueryStringNames</code> type are included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All query strings in viewer requests are included in requests that CloudFront sends to the
     * origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines whether any URL query strings in viewer requests are included in requests that CloudFront
     *         sends to the origin. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>none</code> – Query strings in viewer requests are not included in requests that CloudFront sends
     *         to the origin. Even when this field is set to <code>none</code>, any query strings that are listed in a
     *         <code>CachePolicy</code> <i>are</i> included in origin requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>whitelist</code> – The query strings in viewer requests that are listed in the
     *         <code>QueryStringNames</code> type are included in requests that CloudFront sends to the origin.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>all</code> – All query strings in viewer requests are included in requests that CloudFront sends to
     *         the origin.
     *         </p>
     *         </li>
     * @see OriginRequestPolicyQueryStringBehavior
     */

    public String getQueryStringBehavior() {
        return this.queryStringBehavior;
    }

    /**
     * <p>
     * Determines whether any URL query strings in viewer requests are included in requests that CloudFront sends to the
     * origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Query strings in viewer requests are not included in requests that CloudFront sends to the
     * origin. Even when this field is set to <code>none</code>, any query strings that are listed in a
     * <code>CachePolicy</code> <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The query strings in viewer requests that are listed in the
     * <code>QueryStringNames</code> type are included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All query strings in viewer requests are included in requests that CloudFront sends to the
     * origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @param queryStringBehavior
     *        Determines whether any URL query strings in viewer requests are included in requests that CloudFront sends
     *        to the origin. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>none</code> – Query strings in viewer requests are not included in requests that CloudFront sends to
     *        the origin. Even when this field is set to <code>none</code>, any query strings that are listed in a
     *        <code>CachePolicy</code> <i>are</i> included in origin requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>whitelist</code> – The query strings in viewer requests that are listed in the
     *        <code>QueryStringNames</code> type are included in requests that CloudFront sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> – All query strings in viewer requests are included in requests that CloudFront sends to
     *        the origin.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginRequestPolicyQueryStringBehavior
     */

    public OriginRequestPolicyQueryStringsConfig withQueryStringBehavior(String queryStringBehavior) {
        setQueryStringBehavior(queryStringBehavior);
        return this;
    }

    /**
     * <p>
     * Determines whether any URL query strings in viewer requests are included in requests that CloudFront sends to the
     * origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Query strings in viewer requests are not included in requests that CloudFront sends to the
     * origin. Even when this field is set to <code>none</code>, any query strings that are listed in a
     * <code>CachePolicy</code> <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The query strings in viewer requests that are listed in the
     * <code>QueryStringNames</code> type are included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All query strings in viewer requests are included in requests that CloudFront sends to the
     * origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @param queryStringBehavior
     *        Determines whether any URL query strings in viewer requests are included in requests that CloudFront sends
     *        to the origin. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>none</code> – Query strings in viewer requests are not included in requests that CloudFront sends to
     *        the origin. Even when this field is set to <code>none</code>, any query strings that are listed in a
     *        <code>CachePolicy</code> <i>are</i> included in origin requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>whitelist</code> – The query strings in viewer requests that are listed in the
     *        <code>QueryStringNames</code> type are included in requests that CloudFront sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> – All query strings in viewer requests are included in requests that CloudFront sends to
     *        the origin.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginRequestPolicyQueryStringBehavior
     */

    public OriginRequestPolicyQueryStringsConfig withQueryStringBehavior(OriginRequestPolicyQueryStringBehavior queryStringBehavior) {
        this.queryStringBehavior = queryStringBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Contains a list of the query strings in viewer requests that are included in requests that CloudFront sends to
     * the origin.
     * </p>
     * 
     * @param queryStrings
     *        Contains a list of the query strings in viewer requests that are included in requests that CloudFront
     *        sends to the origin.
     */

    public void setQueryStrings(QueryStringNames queryStrings) {
        this.queryStrings = queryStrings;
    }

    /**
     * <p>
     * Contains a list of the query strings in viewer requests that are included in requests that CloudFront sends to
     * the origin.
     * </p>
     * 
     * @return Contains a list of the query strings in viewer requests that are included in requests that CloudFront
     *         sends to the origin.
     */

    public QueryStringNames getQueryStrings() {
        return this.queryStrings;
    }

    /**
     * <p>
     * Contains a list of the query strings in viewer requests that are included in requests that CloudFront sends to
     * the origin.
     * </p>
     * 
     * @param queryStrings
     *        Contains a list of the query strings in viewer requests that are included in requests that CloudFront
     *        sends to the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginRequestPolicyQueryStringsConfig withQueryStrings(QueryStringNames queryStrings) {
        setQueryStrings(queryStrings);
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
        if (getQueryStringBehavior() != null)
            sb.append("QueryStringBehavior: ").append(getQueryStringBehavior()).append(",");
        if (getQueryStrings() != null)
            sb.append("QueryStrings: ").append(getQueryStrings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginRequestPolicyQueryStringsConfig == false)
            return false;
        OriginRequestPolicyQueryStringsConfig other = (OriginRequestPolicyQueryStringsConfig) obj;
        if (other.getQueryStringBehavior() == null ^ this.getQueryStringBehavior() == null)
            return false;
        if (other.getQueryStringBehavior() != null && other.getQueryStringBehavior().equals(this.getQueryStringBehavior()) == false)
            return false;
        if (other.getQueryStrings() == null ^ this.getQueryStrings() == null)
            return false;
        if (other.getQueryStrings() != null && other.getQueryStrings().equals(this.getQueryStrings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryStringBehavior() == null) ? 0 : getQueryStringBehavior().hashCode());
        hashCode = prime * hashCode + ((getQueryStrings() == null) ? 0 : getQueryStrings().hashCode());
        return hashCode;
    }

    @Override
    public OriginRequestPolicyQueryStringsConfig clone() {
        try {
            return (OriginRequestPolicyQueryStringsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
