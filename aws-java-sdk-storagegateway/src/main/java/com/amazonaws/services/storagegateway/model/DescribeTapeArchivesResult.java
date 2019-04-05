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

/**
 * <p>
 * DescribeTapeArchivesOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapeArchives"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTapeArchivesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon Resource
     * Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names (ARNs) of the tapes,
     * size of the tapes, status of the tapes, progress of the description and tape barcode.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TapeArchive> tapeArchives;
    /**
     * <p>
     * An opaque string that indicates the position at which the virtual tapes that were fetched for description ended.
     * Use this marker in your next request to fetch the next set of virtual tapes in the virtual tape shelf (VTS). If
     * there are no more virtual tapes to describe, this field does not appear in the response.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon Resource
     * Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names (ARNs) of the tapes,
     * size of the tapes, status of the tapes, progress of the description and tape barcode.
     * </p>
     * 
     * @return An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon
     *         Resource Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names
     *         (ARNs) of the tapes, size of the tapes, status of the tapes, progress of the description and tape
     *         barcode.
     */

    public java.util.List<TapeArchive> getTapeArchives() {
        if (tapeArchives == null) {
            tapeArchives = new com.amazonaws.internal.SdkInternalList<TapeArchive>();
        }
        return tapeArchives;
    }

    /**
     * <p>
     * An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon Resource
     * Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names (ARNs) of the tapes,
     * size of the tapes, status of the tapes, progress of the description and tape barcode.
     * </p>
     * 
     * @param tapeArchives
     *        An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon
     *        Resource Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names
     *        (ARNs) of the tapes, size of the tapes, status of the tapes, progress of the description and tape barcode.
     */

    public void setTapeArchives(java.util.Collection<TapeArchive> tapeArchives) {
        if (tapeArchives == null) {
            this.tapeArchives = null;
            return;
        }

        this.tapeArchives = new com.amazonaws.internal.SdkInternalList<TapeArchive>(tapeArchives);
    }

    /**
     * <p>
     * An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon Resource
     * Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names (ARNs) of the tapes,
     * size of the tapes, status of the tapes, progress of the description and tape barcode.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTapeArchives(java.util.Collection)} or {@link #withTapeArchives(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tapeArchives
     *        An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon
     *        Resource Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names
     *        (ARNs) of the tapes, size of the tapes, status of the tapes, progress of the description and tape barcode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapeArchivesResult withTapeArchives(TapeArchive... tapeArchives) {
        if (this.tapeArchives == null) {
            setTapeArchives(new com.amazonaws.internal.SdkInternalList<TapeArchive>(tapeArchives.length));
        }
        for (TapeArchive ele : tapeArchives) {
            this.tapeArchives.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon Resource
     * Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names (ARNs) of the tapes,
     * size of the tapes, status of the tapes, progress of the description and tape barcode.
     * </p>
     * 
     * @param tapeArchives
     *        An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon
     *        Resource Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names
     *        (ARNs) of the tapes, size of the tapes, status of the tapes, progress of the description and tape barcode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapeArchivesResult withTapeArchives(java.util.Collection<TapeArchive> tapeArchives) {
        setTapeArchives(tapeArchives);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which the virtual tapes that were fetched for description ended.
     * Use this marker in your next request to fetch the next set of virtual tapes in the virtual tape shelf (VTS). If
     * there are no more virtual tapes to describe, this field does not appear in the response.
     * </p>
     * 
     * @param marker
     *        An opaque string that indicates the position at which the virtual tapes that were fetched for description
     *        ended. Use this marker in your next request to fetch the next set of virtual tapes in the virtual tape
     *        shelf (VTS). If there are no more virtual tapes to describe, this field does not appear in the response.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which the virtual tapes that were fetched for description ended.
     * Use this marker in your next request to fetch the next set of virtual tapes in the virtual tape shelf (VTS). If
     * there are no more virtual tapes to describe, this field does not appear in the response.
     * </p>
     * 
     * @return An opaque string that indicates the position at which the virtual tapes that were fetched for description
     *         ended. Use this marker in your next request to fetch the next set of virtual tapes in the virtual tape
     *         shelf (VTS). If there are no more virtual tapes to describe, this field does not appear in the response.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which the virtual tapes that were fetched for description ended.
     * Use this marker in your next request to fetch the next set of virtual tapes in the virtual tape shelf (VTS). If
     * there are no more virtual tapes to describe, this field does not appear in the response.
     * </p>
     * 
     * @param marker
     *        An opaque string that indicates the position at which the virtual tapes that were fetched for description
     *        ended. Use this marker in your next request to fetch the next set of virtual tapes in the virtual tape
     *        shelf (VTS). If there are no more virtual tapes to describe, this field does not appear in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapeArchivesResult withMarker(String marker) {
        setMarker(marker);
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
        if (getTapeArchives() != null)
            sb.append("TapeArchives: ").append(getTapeArchives()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTapeArchivesResult == false)
            return false;
        DescribeTapeArchivesResult other = (DescribeTapeArchivesResult) obj;
        if (other.getTapeArchives() == null ^ this.getTapeArchives() == null)
            return false;
        if (other.getTapeArchives() != null && other.getTapeArchives().equals(this.getTapeArchives()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeArchives() == null) ? 0 : getTapeArchives().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTapeArchivesResult clone() {
        try {
            return (DescribeTapeArchivesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
