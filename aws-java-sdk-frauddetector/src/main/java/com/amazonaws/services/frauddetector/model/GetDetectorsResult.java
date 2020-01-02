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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDetectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The detectors.
     * </p>
     */
    private java.util.List<Detector> detectors;
    /**
     * <p>
     * The next page token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The detectors.
     * </p>
     * 
     * @return The detectors.
     */

    public java.util.List<Detector> getDetectors() {
        return detectors;
    }

    /**
     * <p>
     * The detectors.
     * </p>
     * 
     * @param detectors
     *        The detectors.
     */

    public void setDetectors(java.util.Collection<Detector> detectors) {
        if (detectors == null) {
            this.detectors = null;
            return;
        }

        this.detectors = new java.util.ArrayList<Detector>(detectors);
    }

    /**
     * <p>
     * The detectors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectors(java.util.Collection)} or {@link #withDetectors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param detectors
     *        The detectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorsResult withDetectors(Detector... detectors) {
        if (this.detectors == null) {
            setDetectors(new java.util.ArrayList<Detector>(detectors.length));
        }
        for (Detector ele : detectors) {
            this.detectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The detectors.
     * </p>
     * 
     * @param detectors
     *        The detectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorsResult withDetectors(java.util.Collection<Detector> detectors) {
        setDetectors(detectors);
        return this;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @param nextToken
     *        The next page token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @return The next page token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @param nextToken
     *        The next page token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorsResult withNextToken(String nextToken) {
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
        if (getDetectors() != null)
            sb.append("Detectors: ").append(getDetectors()).append(",");
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

        if (obj instanceof GetDetectorsResult == false)
            return false;
        GetDetectorsResult other = (GetDetectorsResult) obj;
        if (other.getDetectors() == null ^ this.getDetectors() == null)
            return false;
        if (other.getDetectors() != null && other.getDetectors().equals(this.getDetectors()) == false)
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

        hashCode = prime * hashCode + ((getDetectors() == null) ? 0 : getDetectors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDetectorsResult clone() {
        try {
            return (GetDetectorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
