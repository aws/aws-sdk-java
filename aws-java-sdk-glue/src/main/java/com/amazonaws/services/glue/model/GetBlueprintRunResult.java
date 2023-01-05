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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetBlueprintRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBlueprintRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a <code>BlueprintRun</code> object.
     * </p>
     */
    private BlueprintRun blueprintRun;

    /**
     * <p>
     * Returns a <code>BlueprintRun</code> object.
     * </p>
     * 
     * @param blueprintRun
     *        Returns a <code>BlueprintRun</code> object.
     */

    public void setBlueprintRun(BlueprintRun blueprintRun) {
        this.blueprintRun = blueprintRun;
    }

    /**
     * <p>
     * Returns a <code>BlueprintRun</code> object.
     * </p>
     * 
     * @return Returns a <code>BlueprintRun</code> object.
     */

    public BlueprintRun getBlueprintRun() {
        return this.blueprintRun;
    }

    /**
     * <p>
     * Returns a <code>BlueprintRun</code> object.
     * </p>
     * 
     * @param blueprintRun
     *        Returns a <code>BlueprintRun</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintRunResult withBlueprintRun(BlueprintRun blueprintRun) {
        setBlueprintRun(blueprintRun);
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
        if (getBlueprintRun() != null)
            sb.append("BlueprintRun: ").append(getBlueprintRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBlueprintRunResult == false)
            return false;
        GetBlueprintRunResult other = (GetBlueprintRunResult) obj;
        if (other.getBlueprintRun() == null ^ this.getBlueprintRun() == null)
            return false;
        if (other.getBlueprintRun() != null && other.getBlueprintRun().equals(this.getBlueprintRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprintRun() == null) ? 0 : getBlueprintRun().hashCode());
        return hashCode;
    }

    @Override
    public GetBlueprintRunResult clone() {
        try {
            return (GetBlueprintRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
