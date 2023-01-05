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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateSpace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSpaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The space's Amazon Resource Name (ARN).
     * </p>
     */
    private String spaceArn;

    /**
     * <p>
     * The space's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param spaceArn
     *        The space's Amazon Resource Name (ARN).
     */

    public void setSpaceArn(String spaceArn) {
        this.spaceArn = spaceArn;
    }

    /**
     * <p>
     * The space's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The space's Amazon Resource Name (ARN).
     */

    public String getSpaceArn() {
        return this.spaceArn;
    }

    /**
     * <p>
     * The space's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param spaceArn
     *        The space's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSpaceResult withSpaceArn(String spaceArn) {
        setSpaceArn(spaceArn);
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
        if (getSpaceArn() != null)
            sb.append("SpaceArn: ").append(getSpaceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSpaceResult == false)
            return false;
        UpdateSpaceResult other = (UpdateSpaceResult) obj;
        if (other.getSpaceArn() == null ^ this.getSpaceArn() == null)
            return false;
        if (other.getSpaceArn() != null && other.getSpaceArn().equals(this.getSpaceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpaceArn() == null) ? 0 : getSpaceArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSpaceResult clone() {
        try {
            return (UpdateSpaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
