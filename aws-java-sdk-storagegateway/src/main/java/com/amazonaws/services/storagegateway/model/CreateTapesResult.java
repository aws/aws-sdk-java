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
 * CreateTapeOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateTapes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTapesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tapeARNs;

    /**
     * <p>
     * A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
     * </p>
     * 
     * @return A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
     */

    public java.util.List<String> getTapeARNs() {
        if (tapeARNs == null) {
            tapeARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tapeARNs;
    }

    /**
     * <p>
     * A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
     * </p>
     * 
     * @param tapeARNs
     *        A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
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
     * A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTapeARNs(java.util.Collection)} or {@link #withTapeARNs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tapeARNs
     *        A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesResult withTapeARNs(String... tapeARNs) {
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
     * A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
     * </p>
     * 
     * @param tapeARNs
     *        A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesResult withTapeARNs(java.util.Collection<String> tapeARNs) {
        setTapeARNs(tapeARNs);
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
            sb.append("TapeARNs: ").append(getTapeARNs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTapesResult == false)
            return false;
        CreateTapesResult other = (CreateTapesResult) obj;
        if (other.getTapeARNs() == null ^ this.getTapeARNs() == null)
            return false;
        if (other.getTapeARNs() != null && other.getTapeARNs().equals(this.getTapeARNs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARNs() == null) ? 0 : getTapeARNs().hashCode());
        return hashCode;
    }

    @Override
    public CreateTapesResult clone() {
        try {
            return (CreateTapesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
