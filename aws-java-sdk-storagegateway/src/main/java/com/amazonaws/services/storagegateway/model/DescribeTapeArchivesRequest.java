/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * DescribeTapeArchivesInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapeArchives"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTapeArchivesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tapeARNs;
    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing virtual tapes.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Specifies that the number of virtual tapes descried be limited to the specified number.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
     * </p>
     * 
     * @return Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to
     *         describe.
     */

    public java.util.List<String> getTapeARNs() {
        if (tapeARNs == null) {
            tapeARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tapeARNs;
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
     * </p>
     * 
     * @param tapeARNs
     *        Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to
     *        describe.
     */

    public void setTapeARNs(java.util.Collection<String> tapeARNs) {
        if (tapeARNs == null) {
            this.tapeARNs = null;
            return;
        }

        this.tapeARNs = new com.amazonaws.internal.SdkInternalList<String>(tapeARNs);
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTapeARNs(java.util.Collection)} or {@link #withTapeARNs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tapeARNs
     *        Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to
     *        describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapeArchivesRequest withTapeARNs(String... tapeARNs) {
        if (this.tapeARNs == null) {
            setTapeARNs(new com.amazonaws.internal.SdkInternalList<String>(tapeARNs.length));
        }
        for (String ele : tapeARNs) {
            this.tapeARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
     * </p>
     * 
     * @param tapeARNs
     *        Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to
     *        describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapeArchivesRequest withTapeARNs(java.util.Collection<String> tapeARNs) {
        setTapeARNs(tapeARNs);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing virtual tapes.
     * </p>
     * 
     * @param marker
     *        An opaque string that indicates the position at which to begin describing virtual tapes.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing virtual tapes.
     * </p>
     * 
     * @return An opaque string that indicates the position at which to begin describing virtual tapes.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing virtual tapes.
     * </p>
     * 
     * @param marker
     *        An opaque string that indicates the position at which to begin describing virtual tapes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapeArchivesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Specifies that the number of virtual tapes descried be limited to the specified number.
     * </p>
     * 
     * @param limit
     *        Specifies that the number of virtual tapes descried be limited to the specified number.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifies that the number of virtual tapes descried be limited to the specified number.
     * </p>
     * 
     * @return Specifies that the number of virtual tapes descried be limited to the specified number.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Specifies that the number of virtual tapes descried be limited to the specified number.
     * </p>
     * 
     * @param limit
     *        Specifies that the number of virtual tapes descried be limited to the specified number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapeArchivesRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getTapeARNs() != null)
            sb.append("TapeARNs: ").append(getTapeARNs()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTapeArchivesRequest == false)
            return false;
        DescribeTapeArchivesRequest other = (DescribeTapeArchivesRequest) obj;
        if (other.getTapeARNs() == null ^ this.getTapeARNs() == null)
            return false;
        if (other.getTapeARNs() != null && other.getTapeARNs().equals(this.getTapeARNs()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARNs() == null) ? 0 : getTapeARNs().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTapeArchivesRequest clone() {
        return (DescribeTapeArchivesRequest) super.clone();
    }

}
