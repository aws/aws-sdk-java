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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBRecommendations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of recommendations which is returned from <code>DescribeDBRecommendations</code> API request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBRecommendation> dBRecommendations;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>DBRecommendationsMessage</code> request. This token can
     * be used later in a <code>DescribeDBRecomendations</code> request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of recommendations which is returned from <code>DescribeDBRecommendations</code> API request.
     * </p>
     * 
     * @return A list of recommendations which is returned from <code>DescribeDBRecommendations</code> API request.
     */

    public java.util.List<DBRecommendation> getDBRecommendations() {
        if (dBRecommendations == null) {
            dBRecommendations = new com.amazonaws.internal.SdkInternalList<DBRecommendation>();
        }
        return dBRecommendations;
    }

    /**
     * <p>
     * A list of recommendations which is returned from <code>DescribeDBRecommendations</code> API request.
     * </p>
     * 
     * @param dBRecommendations
     *        A list of recommendations which is returned from <code>DescribeDBRecommendations</code> API request.
     */

    public void setDBRecommendations(java.util.Collection<DBRecommendation> dBRecommendations) {
        if (dBRecommendations == null) {
            this.dBRecommendations = null;
            return;
        }

        this.dBRecommendations = new com.amazonaws.internal.SdkInternalList<DBRecommendation>(dBRecommendations);
    }

    /**
     * <p>
     * A list of recommendations which is returned from <code>DescribeDBRecommendations</code> API request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBRecommendations(java.util.Collection)} or {@link #withDBRecommendations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dBRecommendations
     *        A list of recommendations which is returned from <code>DescribeDBRecommendations</code> API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBRecommendationsResult withDBRecommendations(DBRecommendation... dBRecommendations) {
        if (this.dBRecommendations == null) {
            setDBRecommendations(new com.amazonaws.internal.SdkInternalList<DBRecommendation>(dBRecommendations.length));
        }
        for (DBRecommendation ele : dBRecommendations) {
            this.dBRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of recommendations which is returned from <code>DescribeDBRecommendations</code> API request.
     * </p>
     * 
     * @param dBRecommendations
     *        A list of recommendations which is returned from <code>DescribeDBRecommendations</code> API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBRecommendationsResult withDBRecommendations(java.util.Collection<DBRecommendation> dBRecommendations) {
        setDBRecommendations(dBRecommendations);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DBRecommendationsMessage</code> request. This token can
     * be used later in a <code>DescribeDBRecomendations</code> request.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DBRecommendationsMessage</code> request. This
     *        token can be used later in a <code>DescribeDBRecomendations</code> request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DBRecommendationsMessage</code> request. This token can
     * be used later in a <code>DescribeDBRecomendations</code> request.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DBRecommendationsMessage</code> request. This
     *         token can be used later in a <code>DescribeDBRecomendations</code> request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DBRecommendationsMessage</code> request. This token can
     * be used later in a <code>DescribeDBRecomendations</code> request.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DBRecommendationsMessage</code> request. This
     *        token can be used later in a <code>DescribeDBRecomendations</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBRecommendationsResult withMarker(String marker) {
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
        if (getDBRecommendations() != null)
            sb.append("DBRecommendations: ").append(getDBRecommendations()).append(",");
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

        if (obj instanceof DescribeDBRecommendationsResult == false)
            return false;
        DescribeDBRecommendationsResult other = (DescribeDBRecommendationsResult) obj;
        if (other.getDBRecommendations() == null ^ this.getDBRecommendations() == null)
            return false;
        if (other.getDBRecommendations() != null && other.getDBRecommendations().equals(this.getDBRecommendations()) == false)
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

        hashCode = prime * hashCode + ((getDBRecommendations() == null) ? 0 : getDBRecommendations().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBRecommendationsResult clone() {
        try {
            return (DescribeDBRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
