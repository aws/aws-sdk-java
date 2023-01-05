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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeSenderIds"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSenderIdsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of SernderIdInformation objects that contain the details for the requested SenderIds.
     * </p>
     */
    private java.util.List<SenderIdInformation> senderIds;
    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of SernderIdInformation objects that contain the details for the requested SenderIds.
     * </p>
     * 
     * @return An array of SernderIdInformation objects that contain the details for the requested SenderIds.
     */

    public java.util.List<SenderIdInformation> getSenderIds() {
        return senderIds;
    }

    /**
     * <p>
     * An array of SernderIdInformation objects that contain the details for the requested SenderIds.
     * </p>
     * 
     * @param senderIds
     *        An array of SernderIdInformation objects that contain the details for the requested SenderIds.
     */

    public void setSenderIds(java.util.Collection<SenderIdInformation> senderIds) {
        if (senderIds == null) {
            this.senderIds = null;
            return;
        }

        this.senderIds = new java.util.ArrayList<SenderIdInformation>(senderIds);
    }

    /**
     * <p>
     * An array of SernderIdInformation objects that contain the details for the requested SenderIds.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSenderIds(java.util.Collection)} or {@link #withSenderIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param senderIds
     *        An array of SernderIdInformation objects that contain the details for the requested SenderIds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSenderIdsResult withSenderIds(SenderIdInformation... senderIds) {
        if (this.senderIds == null) {
            setSenderIds(new java.util.ArrayList<SenderIdInformation>(senderIds.length));
        }
        for (SenderIdInformation ele : senderIds) {
            this.senderIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of SernderIdInformation objects that contain the details for the requested SenderIds.
     * </p>
     * 
     * @param senderIds
     *        An array of SernderIdInformation objects that contain the details for the requested SenderIds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSenderIdsResult withSenderIds(java.util.Collection<SenderIdInformation> senderIds) {
        setSenderIds(senderIds);
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

    public DescribeSenderIdsResult withNextToken(String nextToken) {
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
        if (getSenderIds() != null)
            sb.append("SenderIds: ").append(getSenderIds()).append(",");
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

        if (obj instanceof DescribeSenderIdsResult == false)
            return false;
        DescribeSenderIdsResult other = (DescribeSenderIdsResult) obj;
        if (other.getSenderIds() == null ^ this.getSenderIds() == null)
            return false;
        if (other.getSenderIds() != null && other.getSenderIds().equals(this.getSenderIds()) == false)
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

        hashCode = prime * hashCode + ((getSenderIds() == null) ? 0 : getSenderIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSenderIdsResult clone() {
        try {
            return (DescribeSenderIdsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
