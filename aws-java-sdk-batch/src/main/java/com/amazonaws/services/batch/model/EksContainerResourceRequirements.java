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
 * The type and amount of resources to assign to a container. The supported resources include <code>memory</code>,
 * <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more information, see <a
 * href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management for pods
 * and containers</a> in the <i>Kubernetes documentation</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksContainerResourceRequirements"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksContainerResourceRequirements implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type and quantity of the resources to reserve for the container. The values vary based on the
     * <code>name</code> that's specified. Resources can be requested using either the <code>limits</code> or the
     * <code>requests</code> objects.
     * </p>
     * <dl>
     * <dt>memory</dt>
     * <dd>
     * <p>
     * The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your container
     * attempts to exceed the memory specified, the container is terminated. You must specify at least 4 MiB of memory
     * for a job. <code>memory</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     * <code>memory</code> is specified in both places, then the value that's specified in <code>limits</code> must be
     * equal to the value that's specified in <code>requests</code>.
     * </p>
     * <note>
     * <p>
     * To maximize your resource utilization, provide your jobs with as much memory as possible for the specific
     * instance type that you are using. To learn how, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in the
     * <i>Batch User Guide</i>.
     * </p>
     * </note></dd>
     * <dt>cpu</dt>
     * <dd>
     * <p>
     * The number of CPUs that's reserved for the container. Values must be an even multiple of <code>0.25</code>.
     * <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If <code>cpu</code> is
     * specified in both places, then the value that's specified in <code>limits</code> must be at least as large as the
     * value that's specified in <code>requests</code>.
     * </p>
     * </dd>
     * <dt>nvidia.com/gpu</dt>
     * <dd>
     * <p>
     * The number of GPUs that's reserved for the container. Values must be a whole integer. <code>memory</code> can be
     * specified in <code>limits</code>, <code>requests</code>, or both. If <code>memory</code> is specified in both
     * places, then the value that's specified in <code>limits</code> must be equal to the value that's specified in
     * <code>requests</code>.
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.Map<String, String> limits;
    /**
     * <p>
     * The type and quantity of the resources to request for the container. The values vary based on the
     * <code>name</code> that's specified. Resources can be requested by using either the <code>limits</code> or the
     * <code>requests</code> objects.
     * </p>
     * <dl>
     * <dt>memory</dt>
     * <dd>
     * <p>
     * The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your container
     * attempts to exceed the memory specified, the container is terminated. You must specify at least 4 MiB of memory
     * for a job. <code>memory</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     * <code>memory</code> is specified in both, then the value that's specified in <code>limits</code> must be equal to
     * the value that's specified in <code>requests</code>.
     * </p>
     * <note>
     * <p>
     * If you're trying to maximize your resource utilization by providing your jobs as much memory as possible for a
     * particular instance type, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in the
     * <i>Batch User Guide</i>.
     * </p>
     * </note></dd>
     * <dt>cpu</dt>
     * <dd>
     * <p>
     * The number of CPUs that are reserved for the container. Values must be an even multiple of <code>0.25</code>.
     * <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If <code>cpu</code> is
     * specified in both, then the value that's specified in <code>limits</code> must be at least as large as the value
     * that's specified in <code>requests</code>.
     * </p>
     * </dd>
     * <dt>nvidia.com/gpu</dt>
     * <dd>
     * <p>
     * The number of GPUs that are reserved for the container. Values must be a whole integer.
     * <code>nvidia.com/gpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     * <code>nvidia.com/gpu</code> is specified in both, then the value that's specified in <code>limits</code> must be
     * equal to the value that's specified in <code>requests</code>.
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.Map<String, String> requests;

    /**
     * <p>
     * The type and quantity of the resources to reserve for the container. The values vary based on the
     * <code>name</code> that's specified. Resources can be requested using either the <code>limits</code> or the
     * <code>requests</code> objects.
     * </p>
     * <dl>
     * <dt>memory</dt>
     * <dd>
     * <p>
     * The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your container
     * attempts to exceed the memory specified, the container is terminated. You must specify at least 4 MiB of memory
     * for a job. <code>memory</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     * <code>memory</code> is specified in both places, then the value that's specified in <code>limits</code> must be
     * equal to the value that's specified in <code>requests</code>.
     * </p>
     * <note>
     * <p>
     * To maximize your resource utilization, provide your jobs with as much memory as possible for the specific
     * instance type that you are using. To learn how, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in the
     * <i>Batch User Guide</i>.
     * </p>
     * </note></dd>
     * <dt>cpu</dt>
     * <dd>
     * <p>
     * The number of CPUs that's reserved for the container. Values must be an even multiple of <code>0.25</code>.
     * <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If <code>cpu</code> is
     * specified in both places, then the value that's specified in <code>limits</code> must be at least as large as the
     * value that's specified in <code>requests</code>.
     * </p>
     * </dd>
     * <dt>nvidia.com/gpu</dt>
     * <dd>
     * <p>
     * The number of GPUs that's reserved for the container. Values must be a whole integer. <code>memory</code> can be
     * specified in <code>limits</code>, <code>requests</code>, or both. If <code>memory</code> is specified in both
     * places, then the value that's specified in <code>limits</code> must be equal to the value that's specified in
     * <code>requests</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The type and quantity of the resources to reserve for the container. The values vary based on the
     *         <code>name</code> that's specified. Resources can be requested using either the <code>limits</code> or
     *         the <code>requests</code> objects.</p>
     *         <dl>
     *         <dt>memory</dt>
     *         <dd>
     *         <p>
     *         The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your
     *         container attempts to exceed the memory specified, the container is terminated. You must specify at least
     *         4 MiB of memory for a job. <code>memory</code> can be specified in <code>limits</code>,
     *         <code>requests</code>, or both. If <code>memory</code> is specified in both places, then the value that's
     *         specified in <code>limits</code> must be equal to the value that's specified in <code>requests</code>.
     *         </p>
     *         <note>
     *         <p>
     *         To maximize your resource utilization, provide your jobs with as much memory as possible for the specific
     *         instance type that you are using. To learn how, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in
     *         the <i>Batch User Guide</i>.
     *         </p>
     *         </note></dd>
     *         <dt>cpu</dt>
     *         <dd>
     *         <p>
     *         The number of CPUs that's reserved for the container. Values must be an even multiple of
     *         <code>0.25</code>. <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or
     *         both. If <code>cpu</code> is specified in both places, then the value that's specified in
     *         <code>limits</code> must be at least as large as the value that's specified in <code>requests</code>.
     *         </p>
     *         </dd>
     *         <dt>nvidia.com/gpu</dt>
     *         <dd>
     *         <p>
     *         The number of GPUs that's reserved for the container. Values must be a whole integer. <code>memory</code>
     *         can be specified in <code>limits</code>, <code>requests</code>, or both. If <code>memory</code> is
     *         specified in both places, then the value that's specified in <code>limits</code> must be equal to the
     *         value that's specified in <code>requests</code>.
     *         </p>
     *         </dd>
     */

    public java.util.Map<String, String> getLimits() {
        return limits;
    }

    /**
     * <p>
     * The type and quantity of the resources to reserve for the container. The values vary based on the
     * <code>name</code> that's specified. Resources can be requested using either the <code>limits</code> or the
     * <code>requests</code> objects.
     * </p>
     * <dl>
     * <dt>memory</dt>
     * <dd>
     * <p>
     * The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your container
     * attempts to exceed the memory specified, the container is terminated. You must specify at least 4 MiB of memory
     * for a job. <code>memory</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     * <code>memory</code> is specified in both places, then the value that's specified in <code>limits</code> must be
     * equal to the value that's specified in <code>requests</code>.
     * </p>
     * <note>
     * <p>
     * To maximize your resource utilization, provide your jobs with as much memory as possible for the specific
     * instance type that you are using. To learn how, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in the
     * <i>Batch User Guide</i>.
     * </p>
     * </note></dd>
     * <dt>cpu</dt>
     * <dd>
     * <p>
     * The number of CPUs that's reserved for the container. Values must be an even multiple of <code>0.25</code>.
     * <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If <code>cpu</code> is
     * specified in both places, then the value that's specified in <code>limits</code> must be at least as large as the
     * value that's specified in <code>requests</code>.
     * </p>
     * </dd>
     * <dt>nvidia.com/gpu</dt>
     * <dd>
     * <p>
     * The number of GPUs that's reserved for the container. Values must be a whole integer. <code>memory</code> can be
     * specified in <code>limits</code>, <code>requests</code>, or both. If <code>memory</code> is specified in both
     * places, then the value that's specified in <code>limits</code> must be equal to the value that's specified in
     * <code>requests</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param limits
     *        The type and quantity of the resources to reserve for the container. The values vary based on the
     *        <code>name</code> that's specified. Resources can be requested using either the <code>limits</code> or the
     *        <code>requests</code> objects.</p>
     *        <dl>
     *        <dt>memory</dt>
     *        <dd>
     *        <p>
     *        The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your
     *        container attempts to exceed the memory specified, the container is terminated. You must specify at least
     *        4 MiB of memory for a job. <code>memory</code> can be specified in <code>limits</code>,
     *        <code>requests</code>, or both. If <code>memory</code> is specified in both places, then the value that's
     *        specified in <code>limits</code> must be equal to the value that's specified in <code>requests</code>.
     *        </p>
     *        <note>
     *        <p>
     *        To maximize your resource utilization, provide your jobs with as much memory as possible for the specific
     *        instance type that you are using. To learn how, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in
     *        the <i>Batch User Guide</i>.
     *        </p>
     *        </note></dd>
     *        <dt>cpu</dt>
     *        <dd>
     *        <p>
     *        The number of CPUs that's reserved for the container. Values must be an even multiple of <code>0.25</code>. <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     *        <code>cpu</code> is specified in both places, then the value that's specified in <code>limits</code> must
     *        be at least as large as the value that's specified in <code>requests</code>.
     *        </p>
     *        </dd>
     *        <dt>nvidia.com/gpu</dt>
     *        <dd>
     *        <p>
     *        The number of GPUs that's reserved for the container. Values must be a whole integer. <code>memory</code>
     *        can be specified in <code>limits</code>, <code>requests</code>, or both. If <code>memory</code> is
     *        specified in both places, then the value that's specified in <code>limits</code> must be equal to the
     *        value that's specified in <code>requests</code>.
     *        </p>
     *        </dd>
     */

    public void setLimits(java.util.Map<String, String> limits) {
        this.limits = limits;
    }

    /**
     * <p>
     * The type and quantity of the resources to reserve for the container. The values vary based on the
     * <code>name</code> that's specified. Resources can be requested using either the <code>limits</code> or the
     * <code>requests</code> objects.
     * </p>
     * <dl>
     * <dt>memory</dt>
     * <dd>
     * <p>
     * The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your container
     * attempts to exceed the memory specified, the container is terminated. You must specify at least 4 MiB of memory
     * for a job. <code>memory</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     * <code>memory</code> is specified in both places, then the value that's specified in <code>limits</code> must be
     * equal to the value that's specified in <code>requests</code>.
     * </p>
     * <note>
     * <p>
     * To maximize your resource utilization, provide your jobs with as much memory as possible for the specific
     * instance type that you are using. To learn how, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in the
     * <i>Batch User Guide</i>.
     * </p>
     * </note></dd>
     * <dt>cpu</dt>
     * <dd>
     * <p>
     * The number of CPUs that's reserved for the container. Values must be an even multiple of <code>0.25</code>.
     * <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If <code>cpu</code> is
     * specified in both places, then the value that's specified in <code>limits</code> must be at least as large as the
     * value that's specified in <code>requests</code>.
     * </p>
     * </dd>
     * <dt>nvidia.com/gpu</dt>
     * <dd>
     * <p>
     * The number of GPUs that's reserved for the container. Values must be a whole integer. <code>memory</code> can be
     * specified in <code>limits</code>, <code>requests</code>, or both. If <code>memory</code> is specified in both
     * places, then the value that's specified in <code>limits</code> must be equal to the value that's specified in
     * <code>requests</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param limits
     *        The type and quantity of the resources to reserve for the container. The values vary based on the
     *        <code>name</code> that's specified. Resources can be requested using either the <code>limits</code> or the
     *        <code>requests</code> objects.</p>
     *        <dl>
     *        <dt>memory</dt>
     *        <dd>
     *        <p>
     *        The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your
     *        container attempts to exceed the memory specified, the container is terminated. You must specify at least
     *        4 MiB of memory for a job. <code>memory</code> can be specified in <code>limits</code>,
     *        <code>requests</code>, or both. If <code>memory</code> is specified in both places, then the value that's
     *        specified in <code>limits</code> must be equal to the value that's specified in <code>requests</code>.
     *        </p>
     *        <note>
     *        <p>
     *        To maximize your resource utilization, provide your jobs with as much memory as possible for the specific
     *        instance type that you are using. To learn how, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in
     *        the <i>Batch User Guide</i>.
     *        </p>
     *        </note></dd>
     *        <dt>cpu</dt>
     *        <dd>
     *        <p>
     *        The number of CPUs that's reserved for the container. Values must be an even multiple of <code>0.25</code>. <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     *        <code>cpu</code> is specified in both places, then the value that's specified in <code>limits</code> must
     *        be at least as large as the value that's specified in <code>requests</code>.
     *        </p>
     *        </dd>
     *        <dt>nvidia.com/gpu</dt>
     *        <dd>
     *        <p>
     *        The number of GPUs that's reserved for the container. Values must be a whole integer. <code>memory</code>
     *        can be specified in <code>limits</code>, <code>requests</code>, or both. If <code>memory</code> is
     *        specified in both places, then the value that's specified in <code>limits</code> must be equal to the
     *        value that's specified in <code>requests</code>.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerResourceRequirements withLimits(java.util.Map<String, String> limits) {
        setLimits(limits);
        return this;
    }

    /**
     * Add a single Limits entry
     *
     * @see EksContainerResourceRequirements#withLimits
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerResourceRequirements addLimitsEntry(String key, String value) {
        if (null == this.limits) {
            this.limits = new java.util.HashMap<String, String>();
        }
        if (this.limits.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.limits.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Limits.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerResourceRequirements clearLimitsEntries() {
        this.limits = null;
        return this;
    }

    /**
     * <p>
     * The type and quantity of the resources to request for the container. The values vary based on the
     * <code>name</code> that's specified. Resources can be requested by using either the <code>limits</code> or the
     * <code>requests</code> objects.
     * </p>
     * <dl>
     * <dt>memory</dt>
     * <dd>
     * <p>
     * The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your container
     * attempts to exceed the memory specified, the container is terminated. You must specify at least 4 MiB of memory
     * for a job. <code>memory</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     * <code>memory</code> is specified in both, then the value that's specified in <code>limits</code> must be equal to
     * the value that's specified in <code>requests</code>.
     * </p>
     * <note>
     * <p>
     * If you're trying to maximize your resource utilization by providing your jobs as much memory as possible for a
     * particular instance type, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in the
     * <i>Batch User Guide</i>.
     * </p>
     * </note></dd>
     * <dt>cpu</dt>
     * <dd>
     * <p>
     * The number of CPUs that are reserved for the container. Values must be an even multiple of <code>0.25</code>.
     * <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If <code>cpu</code> is
     * specified in both, then the value that's specified in <code>limits</code> must be at least as large as the value
     * that's specified in <code>requests</code>.
     * </p>
     * </dd>
     * <dt>nvidia.com/gpu</dt>
     * <dd>
     * <p>
     * The number of GPUs that are reserved for the container. Values must be a whole integer.
     * <code>nvidia.com/gpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     * <code>nvidia.com/gpu</code> is specified in both, then the value that's specified in <code>limits</code> must be
     * equal to the value that's specified in <code>requests</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The type and quantity of the resources to request for the container. The values vary based on the
     *         <code>name</code> that's specified. Resources can be requested by using either the <code>limits</code> or
     *         the <code>requests</code> objects.</p>
     *         <dl>
     *         <dt>memory</dt>
     *         <dd>
     *         <p>
     *         The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your
     *         container attempts to exceed the memory specified, the container is terminated. You must specify at least
     *         4 MiB of memory for a job. <code>memory</code> can be specified in <code>limits</code>,
     *         <code>requests</code>, or both. If <code>memory</code> is specified in both, then the value that's
     *         specified in <code>limits</code> must be equal to the value that's specified in <code>requests</code>.
     *         </p>
     *         <note>
     *         <p>
     *         If you're trying to maximize your resource utilization by providing your jobs as much memory as possible
     *         for a particular instance type, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in
     *         the <i>Batch User Guide</i>.
     *         </p>
     *         </note></dd>
     *         <dt>cpu</dt>
     *         <dd>
     *         <p>
     *         The number of CPUs that are reserved for the container. Values must be an even multiple of
     *         <code>0.25</code>. <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or
     *         both. If <code>cpu</code> is specified in both, then the value that's specified in <code>limits</code>
     *         must be at least as large as the value that's specified in <code>requests</code>.
     *         </p>
     *         </dd>
     *         <dt>nvidia.com/gpu</dt>
     *         <dd>
     *         <p>
     *         The number of GPUs that are reserved for the container. Values must be a whole integer.
     *         <code>nvidia.com/gpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     *         <code>nvidia.com/gpu</code> is specified in both, then the value that's specified in <code>limits</code>
     *         must be equal to the value that's specified in <code>requests</code>.
     *         </p>
     *         </dd>
     */

    public java.util.Map<String, String> getRequests() {
        return requests;
    }

    /**
     * <p>
     * The type and quantity of the resources to request for the container. The values vary based on the
     * <code>name</code> that's specified. Resources can be requested by using either the <code>limits</code> or the
     * <code>requests</code> objects.
     * </p>
     * <dl>
     * <dt>memory</dt>
     * <dd>
     * <p>
     * The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your container
     * attempts to exceed the memory specified, the container is terminated. You must specify at least 4 MiB of memory
     * for a job. <code>memory</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     * <code>memory</code> is specified in both, then the value that's specified in <code>limits</code> must be equal to
     * the value that's specified in <code>requests</code>.
     * </p>
     * <note>
     * <p>
     * If you're trying to maximize your resource utilization by providing your jobs as much memory as possible for a
     * particular instance type, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in the
     * <i>Batch User Guide</i>.
     * </p>
     * </note></dd>
     * <dt>cpu</dt>
     * <dd>
     * <p>
     * The number of CPUs that are reserved for the container. Values must be an even multiple of <code>0.25</code>.
     * <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If <code>cpu</code> is
     * specified in both, then the value that's specified in <code>limits</code> must be at least as large as the value
     * that's specified in <code>requests</code>.
     * </p>
     * </dd>
     * <dt>nvidia.com/gpu</dt>
     * <dd>
     * <p>
     * The number of GPUs that are reserved for the container. Values must be a whole integer.
     * <code>nvidia.com/gpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     * <code>nvidia.com/gpu</code> is specified in both, then the value that's specified in <code>limits</code> must be
     * equal to the value that's specified in <code>requests</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param requests
     *        The type and quantity of the resources to request for the container. The values vary based on the
     *        <code>name</code> that's specified. Resources can be requested by using either the <code>limits</code> or
     *        the <code>requests</code> objects.</p>
     *        <dl>
     *        <dt>memory</dt>
     *        <dd>
     *        <p>
     *        The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your
     *        container attempts to exceed the memory specified, the container is terminated. You must specify at least
     *        4 MiB of memory for a job. <code>memory</code> can be specified in <code>limits</code>,
     *        <code>requests</code>, or both. If <code>memory</code> is specified in both, then the value that's
     *        specified in <code>limits</code> must be equal to the value that's specified in <code>requests</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If you're trying to maximize your resource utilization by providing your jobs as much memory as possible
     *        for a particular instance type, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in
     *        the <i>Batch User Guide</i>.
     *        </p>
     *        </note></dd>
     *        <dt>cpu</dt>
     *        <dd>
     *        <p>
     *        The number of CPUs that are reserved for the container. Values must be an even multiple of
     *        <code>0.25</code>. <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or
     *        both. If <code>cpu</code> is specified in both, then the value that's specified in <code>limits</code>
     *        must be at least as large as the value that's specified in <code>requests</code>.
     *        </p>
     *        </dd>
     *        <dt>nvidia.com/gpu</dt>
     *        <dd>
     *        <p>
     *        The number of GPUs that are reserved for the container. Values must be a whole integer.
     *        <code>nvidia.com/gpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     *        <code>nvidia.com/gpu</code> is specified in both, then the value that's specified in <code>limits</code>
     *        must be equal to the value that's specified in <code>requests</code>.
     *        </p>
     *        </dd>
     */

    public void setRequests(java.util.Map<String, String> requests) {
        this.requests = requests;
    }

    /**
     * <p>
     * The type and quantity of the resources to request for the container. The values vary based on the
     * <code>name</code> that's specified. Resources can be requested by using either the <code>limits</code> or the
     * <code>requests</code> objects.
     * </p>
     * <dl>
     * <dt>memory</dt>
     * <dd>
     * <p>
     * The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your container
     * attempts to exceed the memory specified, the container is terminated. You must specify at least 4 MiB of memory
     * for a job. <code>memory</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     * <code>memory</code> is specified in both, then the value that's specified in <code>limits</code> must be equal to
     * the value that's specified in <code>requests</code>.
     * </p>
     * <note>
     * <p>
     * If you're trying to maximize your resource utilization by providing your jobs as much memory as possible for a
     * particular instance type, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in the
     * <i>Batch User Guide</i>.
     * </p>
     * </note></dd>
     * <dt>cpu</dt>
     * <dd>
     * <p>
     * The number of CPUs that are reserved for the container. Values must be an even multiple of <code>0.25</code>.
     * <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If <code>cpu</code> is
     * specified in both, then the value that's specified in <code>limits</code> must be at least as large as the value
     * that's specified in <code>requests</code>.
     * </p>
     * </dd>
     * <dt>nvidia.com/gpu</dt>
     * <dd>
     * <p>
     * The number of GPUs that are reserved for the container. Values must be a whole integer.
     * <code>nvidia.com/gpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     * <code>nvidia.com/gpu</code> is specified in both, then the value that's specified in <code>limits</code> must be
     * equal to the value that's specified in <code>requests</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param requests
     *        The type and quantity of the resources to request for the container. The values vary based on the
     *        <code>name</code> that's specified. Resources can be requested by using either the <code>limits</code> or
     *        the <code>requests</code> objects.</p>
     *        <dl>
     *        <dt>memory</dt>
     *        <dd>
     *        <p>
     *        The memory hard limit (in MiB) for the container, using whole integers, with a "Mi" suffix. If your
     *        container attempts to exceed the memory specified, the container is terminated. You must specify at least
     *        4 MiB of memory for a job. <code>memory</code> can be specified in <code>limits</code>,
     *        <code>requests</code>, or both. If <code>memory</code> is specified in both, then the value that's
     *        specified in <code>limits</code> must be equal to the value that's specified in <code>requests</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If you're trying to maximize your resource utilization by providing your jobs as much memory as possible
     *        for a particular instance type, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory management</a> in
     *        the <i>Batch User Guide</i>.
     *        </p>
     *        </note></dd>
     *        <dt>cpu</dt>
     *        <dd>
     *        <p>
     *        The number of CPUs that are reserved for the container. Values must be an even multiple of
     *        <code>0.25</code>. <code>cpu</code> can be specified in <code>limits</code>, <code>requests</code>, or
     *        both. If <code>cpu</code> is specified in both, then the value that's specified in <code>limits</code>
     *        must be at least as large as the value that's specified in <code>requests</code>.
     *        </p>
     *        </dd>
     *        <dt>nvidia.com/gpu</dt>
     *        <dd>
     *        <p>
     *        The number of GPUs that are reserved for the container. Values must be a whole integer.
     *        <code>nvidia.com/gpu</code> can be specified in <code>limits</code>, <code>requests</code>, or both. If
     *        <code>nvidia.com/gpu</code> is specified in both, then the value that's specified in <code>limits</code>
     *        must be equal to the value that's specified in <code>requests</code>.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerResourceRequirements withRequests(java.util.Map<String, String> requests) {
        setRequests(requests);
        return this;
    }

    /**
     * Add a single Requests entry
     *
     * @see EksContainerResourceRequirements#withRequests
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerResourceRequirements addRequestsEntry(String key, String value) {
        if (null == this.requests) {
            this.requests = new java.util.HashMap<String, String>();
        }
        if (this.requests.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requests.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Requests.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerResourceRequirements clearRequestsEntries() {
        this.requests = null;
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
        if (getLimits() != null)
            sb.append("Limits: ").append(getLimits()).append(",");
        if (getRequests() != null)
            sb.append("Requests: ").append(getRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksContainerResourceRequirements == false)
            return false;
        EksContainerResourceRequirements other = (EksContainerResourceRequirements) obj;
        if (other.getLimits() == null ^ this.getLimits() == null)
            return false;
        if (other.getLimits() != null && other.getLimits().equals(this.getLimits()) == false)
            return false;
        if (other.getRequests() == null ^ this.getRequests() == null)
            return false;
        if (other.getRequests() != null && other.getRequests().equals(this.getRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        hashCode = prime * hashCode + ((getRequests() == null) ? 0 : getRequests().hashCode());
        return hashCode;
    }

    @Override
    public EksContainerResourceRequirements clone() {
        try {
            return (EksContainerResourceRequirements) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksContainerResourceRequirementsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
