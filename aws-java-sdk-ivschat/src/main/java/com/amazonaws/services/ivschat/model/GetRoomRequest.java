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
package com.amazonaws.services.ivschat.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/GetRoom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRoomRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the room for which the configuration is to be retrieved. Currently this must be an ARN.
     * </p>
     */
    private String identifier;

    /**
     * <p>
     * Identifier of the room for which the configuration is to be retrieved. Currently this must be an ARN.
     * </p>
     * 
     * @param identifier
     *        Identifier of the room for which the configuration is to be retrieved. Currently this must be an ARN.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Identifier of the room for which the configuration is to be retrieved. Currently this must be an ARN.
     * </p>
     * 
     * @return Identifier of the room for which the configuration is to be retrieved. Currently this must be an ARN.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Identifier of the room for which the configuration is to be retrieved. Currently this must be an ARN.
     * </p>
     * 
     * @param identifier
     *        Identifier of the room for which the configuration is to be retrieved. Currently this must be an ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRoomRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRoomRequest == false)
            return false;
        GetRoomRequest other = (GetRoomRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetRoomRequest clone() {
        return (GetRoomRequest) super.clone();
    }

}
