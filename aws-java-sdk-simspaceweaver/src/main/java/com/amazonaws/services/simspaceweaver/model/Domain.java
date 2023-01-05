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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of app instances that run the same executable app code and have the same launch options and commands.
 * </p>
 * <p>
 * For more information about domains, see <a
 * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key concepts</a> in the
 * <i>Amazon Web Services SimSpace Weaver User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/Domain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Domain implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of lifecycle management for apps in the domain. This value indicates whether apps in this domain are
     * <i>managed</i> (SimSpace Weaver starts and stops the apps) or <i>unmanaged</i> (you must start and stop the
     * apps).
     * </p>
     * <p class="title">
     * <b>Lifecycle types</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PerWorker</code> – Managed: SimSpace Weaver starts 1 app on each worker
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BySpatialSubdivision</code> – Managed: SimSpace Weaver starts 1 app for each spatial partition
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ByRequest</code> – Unmanaged: You use the <b>StartApp</b> API to start the apps and use the <b>StopApp</b>
     * API to stop the apps.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The lifecycle types will change when the service is released for general availability (GA).
     * </p>
     * </note>
     */
    private String lifecycle;
    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The type of lifecycle management for apps in the domain. This value indicates whether apps in this domain are
     * <i>managed</i> (SimSpace Weaver starts and stops the apps) or <i>unmanaged</i> (you must start and stop the
     * apps).
     * </p>
     * <p class="title">
     * <b>Lifecycle types</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PerWorker</code> – Managed: SimSpace Weaver starts 1 app on each worker
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BySpatialSubdivision</code> – Managed: SimSpace Weaver starts 1 app for each spatial partition
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ByRequest</code> – Unmanaged: You use the <b>StartApp</b> API to start the apps and use the <b>StopApp</b>
     * API to stop the apps.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The lifecycle types will change when the service is released for general availability (GA).
     * </p>
     * </note>
     * 
     * @param lifecycle
     *        The type of lifecycle management for apps in the domain. This value indicates whether apps in this domain
     *        are <i>managed</i> (SimSpace Weaver starts and stops the apps) or <i>unmanaged</i> (you must start and
     *        stop the apps).</p>
     *        <p class="title">
     *        <b>Lifecycle types</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PerWorker</code> – Managed: SimSpace Weaver starts 1 app on each worker
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BySpatialSubdivision</code> – Managed: SimSpace Weaver starts 1 app for each spatial partition
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ByRequest</code> – Unmanaged: You use the <b>StartApp</b> API to start the apps and use the
     *        <b>StopApp</b> API to stop the apps.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The lifecycle types will change when the service is released for general availability (GA).
     *        </p>
     * @see LifecycleManagementStrategy
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The type of lifecycle management for apps in the domain. This value indicates whether apps in this domain are
     * <i>managed</i> (SimSpace Weaver starts and stops the apps) or <i>unmanaged</i> (you must start and stop the
     * apps).
     * </p>
     * <p class="title">
     * <b>Lifecycle types</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PerWorker</code> – Managed: SimSpace Weaver starts 1 app on each worker
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BySpatialSubdivision</code> – Managed: SimSpace Weaver starts 1 app for each spatial partition
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ByRequest</code> – Unmanaged: You use the <b>StartApp</b> API to start the apps and use the <b>StopApp</b>
     * API to stop the apps.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The lifecycle types will change when the service is released for general availability (GA).
     * </p>
     * </note>
     * 
     * @return The type of lifecycle management for apps in the domain. This value indicates whether apps in this domain
     *         are <i>managed</i> (SimSpace Weaver starts and stops the apps) or <i>unmanaged</i> (you must start and
     *         stop the apps).</p>
     *         <p class="title">
     *         <b>Lifecycle types</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PerWorker</code> – Managed: SimSpace Weaver starts 1 app on each worker
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BySpatialSubdivision</code> – Managed: SimSpace Weaver starts 1 app for each spatial partition
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ByRequest</code> – Unmanaged: You use the <b>StartApp</b> API to start the apps and use the
     *         <b>StopApp</b> API to stop the apps.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The lifecycle types will change when the service is released for general availability (GA).
     *         </p>
     * @see LifecycleManagementStrategy
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The type of lifecycle management for apps in the domain. This value indicates whether apps in this domain are
     * <i>managed</i> (SimSpace Weaver starts and stops the apps) or <i>unmanaged</i> (you must start and stop the
     * apps).
     * </p>
     * <p class="title">
     * <b>Lifecycle types</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PerWorker</code> – Managed: SimSpace Weaver starts 1 app on each worker
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BySpatialSubdivision</code> – Managed: SimSpace Weaver starts 1 app for each spatial partition
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ByRequest</code> – Unmanaged: You use the <b>StartApp</b> API to start the apps and use the <b>StopApp</b>
     * API to stop the apps.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The lifecycle types will change when the service is released for general availability (GA).
     * </p>
     * </note>
     * 
     * @param lifecycle
     *        The type of lifecycle management for apps in the domain. This value indicates whether apps in this domain
     *        are <i>managed</i> (SimSpace Weaver starts and stops the apps) or <i>unmanaged</i> (you must start and
     *        stop the apps).</p>
     *        <p class="title">
     *        <b>Lifecycle types</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PerWorker</code> – Managed: SimSpace Weaver starts 1 app on each worker
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BySpatialSubdivision</code> – Managed: SimSpace Weaver starts 1 app for each spatial partition
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ByRequest</code> – Unmanaged: You use the <b>StartApp</b> API to start the apps and use the
     *        <b>StopApp</b> API to stop the apps.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The lifecycle types will change when the service is released for general availability (GA).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecycleManagementStrategy
     */

    public Domain withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The type of lifecycle management for apps in the domain. This value indicates whether apps in this domain are
     * <i>managed</i> (SimSpace Weaver starts and stops the apps) or <i>unmanaged</i> (you must start and stop the
     * apps).
     * </p>
     * <p class="title">
     * <b>Lifecycle types</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PerWorker</code> – Managed: SimSpace Weaver starts 1 app on each worker
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BySpatialSubdivision</code> – Managed: SimSpace Weaver starts 1 app for each spatial partition
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ByRequest</code> – Unmanaged: You use the <b>StartApp</b> API to start the apps and use the <b>StopApp</b>
     * API to stop the apps.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The lifecycle types will change when the service is released for general availability (GA).
     * </p>
     * </note>
     * 
     * @param lifecycle
     *        The type of lifecycle management for apps in the domain. This value indicates whether apps in this domain
     *        are <i>managed</i> (SimSpace Weaver starts and stops the apps) or <i>unmanaged</i> (you must start and
     *        stop the apps).</p>
     *        <p class="title">
     *        <b>Lifecycle types</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PerWorker</code> – Managed: SimSpace Weaver starts 1 app on each worker
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BySpatialSubdivision</code> – Managed: SimSpace Weaver starts 1 app for each spatial partition
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ByRequest</code> – Unmanaged: You use the <b>StartApp</b> API to start the apps and use the
     *        <b>StopApp</b> API to stop the apps.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The lifecycle types will change when the service is released for general availability (GA).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecycleManagementStrategy
     */

    public Domain withLifecycle(LifecycleManagementStrategy lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Domain withName(String name) {
        setName(name);
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
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Domain == false)
            return false;
        Domain other = (Domain) obj;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public Domain clone() {
        try {
            return (Domain) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simspaceweaver.model.transform.DomainMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
