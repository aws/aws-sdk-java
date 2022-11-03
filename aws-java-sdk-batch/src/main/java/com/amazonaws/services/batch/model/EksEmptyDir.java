/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration of a Kubernetes <code>emptyDir</code> volume. An <code>emptyDir</code> volume is first
 * created when a pod is assigned to a node. It exists as long as that pod is running on that node. The
 * <code>emptyDir</code> volume is initially empty. All containers in the pod can read and write the files in the
 * <code>emptyDir</code> volume. However, the <code>emptyDir</code> volume can be mounted at the same or different paths
 * in each container. When a pod is removed from a node for any reason, the data in the <code>emptyDir</code> is deleted
 * permanently. For more information, see <a
 * href="https://kubernetes.io/docs/concepts/storage/volumes/#emptydir">emptyDir</a> in the <i>Kubernetes
 * documentation</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksEmptyDir" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksEmptyDir implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The medium to store the volume. The default value is an empty string, which uses the storage of the node.
     * </p>
     * <dl>
     * <dt>""</dt>
     * <dd>
     * <p>
     * <b>(Default)</b> Use the disk storage of the node.
     * </p>
     * </dd>
     * <dt>"Memory"</dt>
     * <dd>
     * <p>
     * Use the <code>tmpfs</code> volume that's backed by the RAM of the node. Contents of the volume are lost when the
     * node reboots, and any storage on the volume counts against the container's memory limit.
     * </p>
     * </dd>
     * </dl>
     */
    private String medium;
    /**
     * <p>
     * The maximum size of the volume. By default, there's no maximum size defined.
     * </p>
     */
    private String sizeLimit;

    /**
     * <p>
     * The medium to store the volume. The default value is an empty string, which uses the storage of the node.
     * </p>
     * <dl>
     * <dt>""</dt>
     * <dd>
     * <p>
     * <b>(Default)</b> Use the disk storage of the node.
     * </p>
     * </dd>
     * <dt>"Memory"</dt>
     * <dd>
     * <p>
     * Use the <code>tmpfs</code> volume that's backed by the RAM of the node. Contents of the volume are lost when the
     * node reboots, and any storage on the volume counts against the container's memory limit.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param medium
     *        The medium to store the volume. The default value is an empty string, which uses the storage of the
     *        node.</p>
     *        <dl>
     *        <dt>""</dt>
     *        <dd>
     *        <p>
     *        <b>(Default)</b> Use the disk storage of the node.
     *        </p>
     *        </dd>
     *        <dt>"Memory"</dt>
     *        <dd>
     *        <p>
     *        Use the <code>tmpfs</code> volume that's backed by the RAM of the node. Contents of the volume are lost
     *        when the node reboots, and any storage on the volume counts against the container's memory limit.
     *        </p>
     *        </dd>
     */

    public void setMedium(String medium) {
        this.medium = medium;
    }

    /**
     * <p>
     * The medium to store the volume. The default value is an empty string, which uses the storage of the node.
     * </p>
     * <dl>
     * <dt>""</dt>
     * <dd>
     * <p>
     * <b>(Default)</b> Use the disk storage of the node.
     * </p>
     * </dd>
     * <dt>"Memory"</dt>
     * <dd>
     * <p>
     * Use the <code>tmpfs</code> volume that's backed by the RAM of the node. Contents of the volume are lost when the
     * node reboots, and any storage on the volume counts against the container's memory limit.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The medium to store the volume. The default value is an empty string, which uses the storage of the
     *         node.</p>
     *         <dl>
     *         <dt>""</dt>
     *         <dd>
     *         <p>
     *         <b>(Default)</b> Use the disk storage of the node.
     *         </p>
     *         </dd>
     *         <dt>"Memory"</dt>
     *         <dd>
     *         <p>
     *         Use the <code>tmpfs</code> volume that's backed by the RAM of the node. Contents of the volume are lost
     *         when the node reboots, and any storage on the volume counts against the container's memory limit.
     *         </p>
     *         </dd>
     */

    public String getMedium() {
        return this.medium;
    }

    /**
     * <p>
     * The medium to store the volume. The default value is an empty string, which uses the storage of the node.
     * </p>
     * <dl>
     * <dt>""</dt>
     * <dd>
     * <p>
     * <b>(Default)</b> Use the disk storage of the node.
     * </p>
     * </dd>
     * <dt>"Memory"</dt>
     * <dd>
     * <p>
     * Use the <code>tmpfs</code> volume that's backed by the RAM of the node. Contents of the volume are lost when the
     * node reboots, and any storage on the volume counts against the container's memory limit.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param medium
     *        The medium to store the volume. The default value is an empty string, which uses the storage of the
     *        node.</p>
     *        <dl>
     *        <dt>""</dt>
     *        <dd>
     *        <p>
     *        <b>(Default)</b> Use the disk storage of the node.
     *        </p>
     *        </dd>
     *        <dt>"Memory"</dt>
     *        <dd>
     *        <p>
     *        Use the <code>tmpfs</code> volume that's backed by the RAM of the node. Contents of the volume are lost
     *        when the node reboots, and any storage on the volume counts against the container's memory limit.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksEmptyDir withMedium(String medium) {
        setMedium(medium);
        return this;
    }

    /**
     * <p>
     * The maximum size of the volume. By default, there's no maximum size defined.
     * </p>
     * 
     * @param sizeLimit
     *        The maximum size of the volume. By default, there's no maximum size defined.
     */

    public void setSizeLimit(String sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    /**
     * <p>
     * The maximum size of the volume. By default, there's no maximum size defined.
     * </p>
     * 
     * @return The maximum size of the volume. By default, there's no maximum size defined.
     */

    public String getSizeLimit() {
        return this.sizeLimit;
    }

    /**
     * <p>
     * The maximum size of the volume. By default, there's no maximum size defined.
     * </p>
     * 
     * @param sizeLimit
     *        The maximum size of the volume. By default, there's no maximum size defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksEmptyDir withSizeLimit(String sizeLimit) {
        setSizeLimit(sizeLimit);
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
        if (getMedium() != null)
            sb.append("Medium: ").append(getMedium()).append(",");
        if (getSizeLimit() != null)
            sb.append("SizeLimit: ").append(getSizeLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksEmptyDir == false)
            return false;
        EksEmptyDir other = (EksEmptyDir) obj;
        if (other.getMedium() == null ^ this.getMedium() == null)
            return false;
        if (other.getMedium() != null && other.getMedium().equals(this.getMedium()) == false)
            return false;
        if (other.getSizeLimit() == null ^ this.getSizeLimit() == null)
            return false;
        if (other.getSizeLimit() != null && other.getSizeLimit().equals(this.getSizeLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMedium() == null) ? 0 : getMedium().hashCode());
        hashCode = prime * hashCode + ((getSizeLimit() == null) ? 0 : getSizeLimit().hashCode());
        return hashCode;
    }

    @Override
    public EksEmptyDir clone() {
        try {
            return (EksEmptyDir) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksEmptyDirMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
