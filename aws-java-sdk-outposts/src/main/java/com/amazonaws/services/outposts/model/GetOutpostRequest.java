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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpost" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOutpostRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostId;

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostId
     *        The ID or the Amazon Resource Name (ARN) of the Outpost.
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @return The ID or the Amazon Resource Name (ARN) of the Outpost.
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostId
     *        The ID or the Amazon Resource Name (ARN) of the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOutpostRequest withOutpostId(String outpostId) {
        setOutpostId(outpostId);
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
        if (getOutpostId() != null)
            sb.append("OutpostId: ").append(getOutpostId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOutpostRequest == false)
            return false;
        GetOutpostRequest other = (GetOutpostRequest) obj;
        if (other.getOutpostId() == null ^ this.getOutpostId() == null)
            return false;
        if (other.getOutpostId() != null && other.getOutpostId().equals(this.getOutpostId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutpostId() == null) ? 0 : getOutpostId().hashCode());
        return hashCode;
    }

    @Override
    public GetOutpostRequest clone() {
        return (GetOutpostRequest) super.clone();
    }

}
