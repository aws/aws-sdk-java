/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection to be created. The ARN is used as the connection reference when
     * the connection is shared between AWS services.
     * </p>
     * <note>
     * <p>
     * The ARN is never reused if the connection is deleted.
     * </p>
     * </note>
     */
    private String connectionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection to be created. The ARN is used as the connection reference when
     * the connection is shared between AWS services.
     * </p>
     * <note>
     * <p>
     * The ARN is never reused if the connection is deleted.
     * </p>
     * </note>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the connection to be created. The ARN is used as the connection
     *        reference when the connection is shared between AWS services.</p> <note>
     *        <p>
     *        The ARN is never reused if the connection is deleted.
     *        </p>
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection to be created. The ARN is used as the connection reference when
     * the connection is shared between AWS services.
     * </p>
     * <note>
     * <p>
     * The ARN is never reused if the connection is deleted.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the connection to be created. The ARN is used as the connection
     *         reference when the connection is shared between AWS services.</p> <note>
     *         <p>
     *         The ARN is never reused if the connection is deleted.
     *         </p>
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection to be created. The ARN is used as the connection reference when
     * the connection is shared between AWS services.
     * </p>
     * <note>
     * <p>
     * The ARN is never reused if the connection is deleted.
     * </p>
     * </note>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the connection to be created. The ARN is used as the connection
     *        reference when the connection is shared between AWS services.</p> <note>
     *        <p>
     *        The ARN is never reused if the connection is deleted.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionResult withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
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
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectionResult == false)
            return false;
        CreateConnectionResult other = (CreateConnectionResult) obj;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectionResult clone() {
        try {
            return (CreateConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
