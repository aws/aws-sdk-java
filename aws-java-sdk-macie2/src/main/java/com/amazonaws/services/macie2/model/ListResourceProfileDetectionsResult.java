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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListResourceProfileDetections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceProfileDetectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that Amazon Macie found in the bucket. Each object
     * reports the number of occurrences of the specified type and provides information about the custom data identifier
     * or managed data identifier that detected the data.
     * </p>
     */
    private java.util.List<Detection> detections;
    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that Amazon Macie found in the bucket. Each object
     * reports the number of occurrences of the specified type and provides information about the custom data identifier
     * or managed data identifier that detected the data.
     * </p>
     * 
     * @return An array of objects, one for each type of sensitive data that Amazon Macie found in the bucket. Each
     *         object reports the number of occurrences of the specified type and provides information about the custom
     *         data identifier or managed data identifier that detected the data.
     */

    public java.util.List<Detection> getDetections() {
        return detections;
    }

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that Amazon Macie found in the bucket. Each object
     * reports the number of occurrences of the specified type and provides information about the custom data identifier
     * or managed data identifier that detected the data.
     * </p>
     * 
     * @param detections
     *        An array of objects, one for each type of sensitive data that Amazon Macie found in the bucket. Each
     *        object reports the number of occurrences of the specified type and provides information about the custom
     *        data identifier or managed data identifier that detected the data.
     */

    public void setDetections(java.util.Collection<Detection> detections) {
        if (detections == null) {
            this.detections = null;
            return;
        }

        this.detections = new java.util.ArrayList<Detection>(detections);
    }

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that Amazon Macie found in the bucket. Each object
     * reports the number of occurrences of the specified type and provides information about the custom data identifier
     * or managed data identifier that detected the data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetections(java.util.Collection)} or {@link #withDetections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param detections
     *        An array of objects, one for each type of sensitive data that Amazon Macie found in the bucket. Each
     *        object reports the number of occurrences of the specified type and provides information about the custom
     *        data identifier or managed data identifier that detected the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceProfileDetectionsResult withDetections(Detection... detections) {
        if (this.detections == null) {
            setDetections(new java.util.ArrayList<Detection>(detections.length));
        }
        for (Detection ele : detections) {
            this.detections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that Amazon Macie found in the bucket. Each object
     * reports the number of occurrences of the specified type and provides information about the custom data identifier
     * or managed data identifier that detected the data.
     * </p>
     * 
     * @param detections
     *        An array of objects, one for each type of sensitive data that Amazon Macie found in the bucket. Each
     *        object reports the number of occurrences of the specified type and provides information about the custom
     *        data identifier or managed data identifier that detected the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceProfileDetectionsResult withDetections(java.util.Collection<Detection> detections) {
        setDetections(detections);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @return The string to use in a subsequent request to get the next page of results in a paginated response. This
     *         value is null if there are no additional pages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceProfileDetectionsResult withNextToken(String nextToken) {
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
        if (getDetections() != null)
            sb.append("Detections: ").append(getDetections()).append(",");
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

        if (obj instanceof ListResourceProfileDetectionsResult == false)
            return false;
        ListResourceProfileDetectionsResult other = (ListResourceProfileDetectionsResult) obj;
        if (other.getDetections() == null ^ this.getDetections() == null)
            return false;
        if (other.getDetections() != null && other.getDetections().equals(this.getDetections()) == false)
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

        hashCode = prime * hashCode + ((getDetections() == null) ? 0 : getDetections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceProfileDetectionsResult clone() {
        try {
            return (ListResourceProfileDetectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
