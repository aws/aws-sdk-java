/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides a description of the application, such as the application Amazon Resource Name (ARN), status, latest
     * version, and input and output configuration details.
     * </p>
     */
    private ApplicationDetail applicationDetail;

    /**
     * <p>
     * Provides a description of the application, such as the application Amazon Resource Name (ARN), status, latest
     * version, and input and output configuration details.
     * </p>
     * 
     * @param applicationDetail
     *        Provides a description of the application, such as the application Amazon Resource Name (ARN), status,
     *        latest version, and input and output configuration details.
     */

    public void setApplicationDetail(ApplicationDetail applicationDetail) {
        this.applicationDetail = applicationDetail;
    }

    /**
     * <p>
     * Provides a description of the application, such as the application Amazon Resource Name (ARN), status, latest
     * version, and input and output configuration details.
     * </p>
     * 
     * @return Provides a description of the application, such as the application Amazon Resource Name (ARN), status,
     *         latest version, and input and output configuration details.
     */

    public ApplicationDetail getApplicationDetail() {
        return this.applicationDetail;
    }

    /**
     * <p>
     * Provides a description of the application, such as the application Amazon Resource Name (ARN), status, latest
     * version, and input and output configuration details.
     * </p>
     * 
     * @param applicationDetail
     *        Provides a description of the application, such as the application Amazon Resource Name (ARN), status,
     *        latest version, and input and output configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withApplicationDetail(ApplicationDetail applicationDetail) {
        setApplicationDetail(applicationDetail);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationDetail() != null)
            sb.append("ApplicationDetail: " + getApplicationDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationResult == false)
            return false;
        DescribeApplicationResult other = (DescribeApplicationResult) obj;
        if (other.getApplicationDetail() == null ^ this.getApplicationDetail() == null)
            return false;
        if (other.getApplicationDetail() != null && other.getApplicationDetail().equals(this.getApplicationDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationDetail() == null) ? 0 : getApplicationDetail().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationResult clone() {
        try {
            return (DescribeApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
