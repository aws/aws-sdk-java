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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetPropertygraphSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPropertygraphSummaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Mode can take one of two values: <code>BASIC</code> (the default), and <code>DETAILED</code>.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * Mode can take one of two values: <code>BASIC</code> (the default), and <code>DETAILED</code>.
     * </p>
     * 
     * @param mode
     *        Mode can take one of two values: <code>BASIC</code> (the default), and <code>DETAILED</code>.
     * @see GraphSummaryType
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Mode can take one of two values: <code>BASIC</code> (the default), and <code>DETAILED</code>.
     * </p>
     * 
     * @return Mode can take one of two values: <code>BASIC</code> (the default), and <code>DETAILED</code>.
     * @see GraphSummaryType
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Mode can take one of two values: <code>BASIC</code> (the default), and <code>DETAILED</code>.
     * </p>
     * 
     * @param mode
     *        Mode can take one of two values: <code>BASIC</code> (the default), and <code>DETAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GraphSummaryType
     */

    public GetPropertygraphSummaryRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Mode can take one of two values: <code>BASIC</code> (the default), and <code>DETAILED</code>.
     * </p>
     * 
     * @param mode
     *        Mode can take one of two values: <code>BASIC</code> (the default), and <code>DETAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GraphSummaryType
     */

    public GetPropertygraphSummaryRequest withMode(GraphSummaryType mode) {
        this.mode = mode.toString();
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPropertygraphSummaryRequest == false)
            return false;
        GetPropertygraphSummaryRequest other = (GetPropertygraphSummaryRequest) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public GetPropertygraphSummaryRequest clone() {
        return (GetPropertygraphSummaryRequest) super.clone();
    }

}
