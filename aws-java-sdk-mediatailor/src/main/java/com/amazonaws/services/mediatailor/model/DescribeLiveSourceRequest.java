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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeLiveSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLiveSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the live source.
     * </p>
     */
    private String liveSourceName;
    /**
     * <p>
     * The name of the source location associated with this Live Source.
     * </p>
     */
    private String sourceLocationName;

    /**
     * <p>
     * The name of the live source.
     * </p>
     * 
     * @param liveSourceName
     *        The name of the live source.
     */

    public void setLiveSourceName(String liveSourceName) {
        this.liveSourceName = liveSourceName;
    }

    /**
     * <p>
     * The name of the live source.
     * </p>
     * 
     * @return The name of the live source.
     */

    public String getLiveSourceName() {
        return this.liveSourceName;
    }

    /**
     * <p>
     * The name of the live source.
     * </p>
     * 
     * @param liveSourceName
     *        The name of the live source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLiveSourceRequest withLiveSourceName(String liveSourceName) {
        setLiveSourceName(liveSourceName);
        return this;
    }

    /**
     * <p>
     * The name of the source location associated with this Live Source.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location associated with this Live Source.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location associated with this Live Source.
     * </p>
     * 
     * @return The name of the source location associated with this Live Source.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location associated with this Live Source.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location associated with this Live Source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLiveSourceRequest withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
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
        if (getLiveSourceName() != null)
            sb.append("LiveSourceName: ").append(getLiveSourceName()).append(",");
        if (getSourceLocationName() != null)
            sb.append("SourceLocationName: ").append(getSourceLocationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLiveSourceRequest == false)
            return false;
        DescribeLiveSourceRequest other = (DescribeLiveSourceRequest) obj;
        if (other.getLiveSourceName() == null ^ this.getLiveSourceName() == null)
            return false;
        if (other.getLiveSourceName() != null && other.getLiveSourceName().equals(this.getLiveSourceName()) == false)
            return false;
        if (other.getSourceLocationName() == null ^ this.getSourceLocationName() == null)
            return false;
        if (other.getSourceLocationName() != null && other.getSourceLocationName().equals(this.getSourceLocationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLiveSourceName() == null) ? 0 : getLiveSourceName().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLiveSourceRequest clone() {
        return (DescribeLiveSourceRequest) super.clone();
    }

}
