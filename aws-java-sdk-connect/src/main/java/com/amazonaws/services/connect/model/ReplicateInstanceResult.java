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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ReplicateInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicateInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the replicated instance. You can find the <code>instanceId</code> in the ARN of the instance.
     * The replicated instance has the same identifier as the instance it was replicated from.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated instance.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The identifier of the replicated instance. You can find the <code>instanceId</code> in the ARN of the instance.
     * The replicated instance has the same identifier as the instance it was replicated from.
     * </p>
     * 
     * @param id
     *        The identifier of the replicated instance. You can find the <code>instanceId</code> in the ARN of the
     *        instance. The replicated instance has the same identifier as the instance it was replicated from.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the replicated instance. You can find the <code>instanceId</code> in the ARN of the instance.
     * The replicated instance has the same identifier as the instance it was replicated from.
     * </p>
     * 
     * @return The identifier of the replicated instance. You can find the <code>instanceId</code> in the ARN of the
     *         instance. The replicated instance has the same identifier as the instance it was replicated from.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the replicated instance. You can find the <code>instanceId</code> in the ARN of the instance.
     * The replicated instance has the same identifier as the instance it was replicated from.
     * </p>
     * 
     * @param id
     *        The identifier of the replicated instance. You can find the <code>instanceId</code> in the ARN of the
     *        instance. The replicated instance has the same identifier as the instance it was replicated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateInstanceResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the replicated instance.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replicated instance.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the replicated instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateInstanceResult withArn(String arn) {
        setArn(arn);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicateInstanceResult == false)
            return false;
        ReplicateInstanceResult other = (ReplicateInstanceResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public ReplicateInstanceResult clone() {
        try {
            return (ReplicateInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
