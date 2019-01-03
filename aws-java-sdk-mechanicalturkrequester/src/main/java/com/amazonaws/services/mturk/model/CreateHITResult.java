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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateHIT" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHITResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see
     * the HIT Data Structure documentation.
     * </p>
     */
    private HIT hIT;

    /**
     * <p>
     * Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see
     * the HIT Data Structure documentation.
     * </p>
     * 
     * @param hIT
     *        Contains the newly created HIT data. For a description of the HIT data structure as it appears in
     *        responses, see the HIT Data Structure documentation.
     */

    public void setHIT(HIT hIT) {
        this.hIT = hIT;
    }

    /**
     * <p>
     * Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see
     * the HIT Data Structure documentation.
     * </p>
     * 
     * @return Contains the newly created HIT data. For a description of the HIT data structure as it appears in
     *         responses, see the HIT Data Structure documentation.
     */

    public HIT getHIT() {
        return this.hIT;
    }

    /**
     * <p>
     * Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see
     * the HIT Data Structure documentation.
     * </p>
     * 
     * @param hIT
     *        Contains the newly created HIT data. For a description of the HIT data structure as it appears in
     *        responses, see the HIT Data Structure documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITResult withHIT(HIT hIT) {
        setHIT(hIT);
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
        if (getHIT() != null)
            sb.append("HIT: ").append(getHIT());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHITResult == false)
            return false;
        CreateHITResult other = (CreateHITResult) obj;
        if (other.getHIT() == null ^ this.getHIT() == null)
            return false;
        if (other.getHIT() != null && other.getHIT().equals(this.getHIT()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHIT() == null) ? 0 : getHIT().hashCode());
        return hashCode;
    }

    @Override
    public CreateHITResult clone() {
        try {
            return (CreateHITResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
