/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeKeywords"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeKeywordsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The PhoneNumberArn or PoolArn that is associated with the OriginationIdentity.
     * </p>
     */
    private String originationIdentityArn;
    /**
     * <p>
     * The PhoneNumberId or PoolId that is associated with the OriginationIdentity.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * An array of KeywordInformation objects that contain the results.
     * </p>
     */
    private java.util.List<KeywordInformation> keywords;
    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The PhoneNumberArn or PoolArn that is associated with the OriginationIdentity.
     * </p>
     * 
     * @param originationIdentityArn
     *        The PhoneNumberArn or PoolArn that is associated with the OriginationIdentity.
     */

    public void setOriginationIdentityArn(String originationIdentityArn) {
        this.originationIdentityArn = originationIdentityArn;
    }

    /**
     * <p>
     * The PhoneNumberArn or PoolArn that is associated with the OriginationIdentity.
     * </p>
     * 
     * @return The PhoneNumberArn or PoolArn that is associated with the OriginationIdentity.
     */

    public String getOriginationIdentityArn() {
        return this.originationIdentityArn;
    }

    /**
     * <p>
     * The PhoneNumberArn or PoolArn that is associated with the OriginationIdentity.
     * </p>
     * 
     * @param originationIdentityArn
     *        The PhoneNumberArn or PoolArn that is associated with the OriginationIdentity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeywordsResult withOriginationIdentityArn(String originationIdentityArn) {
        setOriginationIdentityArn(originationIdentityArn);
        return this;
    }

    /**
     * <p>
     * The PhoneNumberId or PoolId that is associated with the OriginationIdentity.
     * </p>
     * 
     * @param originationIdentity
     *        The PhoneNumberId or PoolId that is associated with the OriginationIdentity.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The PhoneNumberId or PoolId that is associated with the OriginationIdentity.
     * </p>
     * 
     * @return The PhoneNumberId or PoolId that is associated with the OriginationIdentity.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The PhoneNumberId or PoolId that is associated with the OriginationIdentity.
     * </p>
     * 
     * @param originationIdentity
     *        The PhoneNumberId or PoolId that is associated with the OriginationIdentity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeywordsResult withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * An array of KeywordInformation objects that contain the results.
     * </p>
     * 
     * @return An array of KeywordInformation objects that contain the results.
     */

    public java.util.List<KeywordInformation> getKeywords() {
        return keywords;
    }

    /**
     * <p>
     * An array of KeywordInformation objects that contain the results.
     * </p>
     * 
     * @param keywords
     *        An array of KeywordInformation objects that contain the results.
     */

    public void setKeywords(java.util.Collection<KeywordInformation> keywords) {
        if (keywords == null) {
            this.keywords = null;
            return;
        }

        this.keywords = new java.util.ArrayList<KeywordInformation>(keywords);
    }

    /**
     * <p>
     * An array of KeywordInformation objects that contain the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeywords(java.util.Collection)} or {@link #withKeywords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param keywords
     *        An array of KeywordInformation objects that contain the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeywordsResult withKeywords(KeywordInformation... keywords) {
        if (this.keywords == null) {
            setKeywords(new java.util.ArrayList<KeywordInformation>(keywords.length));
        }
        for (KeywordInformation ele : keywords) {
            this.keywords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of KeywordInformation objects that contain the results.
     * </p>
     * 
     * @param keywords
     *        An array of KeywordInformation objects that contain the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeywordsResult withKeywords(java.util.Collection<KeywordInformation> keywords) {
        setKeywords(keywords);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. If this field is empty then there are no more
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results. If this field is empty then there are no more
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. If this field is empty then there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeywordsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getOriginationIdentityArn() != null)
            sb.append("OriginationIdentityArn: ").append(getOriginationIdentityArn()).append(",");
        if (getOriginationIdentity() != null)
            sb.append("OriginationIdentity: ").append(getOriginationIdentity()).append(",");
        if (getKeywords() != null)
            sb.append("Keywords: ").append(getKeywords()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKeywordsResult == false)
            return false;
        DescribeKeywordsResult other = (DescribeKeywordsResult) obj;
        if (other.getOriginationIdentityArn() == null ^ this.getOriginationIdentityArn() == null)
            return false;
        if (other.getOriginationIdentityArn() != null && other.getOriginationIdentityArn().equals(this.getOriginationIdentityArn()) == false)
            return false;
        if (other.getOriginationIdentity() == null ^ this.getOriginationIdentity() == null)
            return false;
        if (other.getOriginationIdentity() != null && other.getOriginationIdentity().equals(this.getOriginationIdentity()) == false)
            return false;
        if (other.getKeywords() == null ^ this.getKeywords() == null)
            return false;
        if (other.getKeywords() != null && other.getKeywords().equals(this.getKeywords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginationIdentityArn() == null) ? 0 : getOriginationIdentityArn().hashCode());
        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeKeywordsResult clone() {
        try {
            return (DescribeKeywordsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
