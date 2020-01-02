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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/PutClusterCapacityProviders" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutClusterCapacityProvidersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to modify the capacity provider settings for. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The name of one or more capacity providers to associate with the cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capacityProviders;
    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity provider or launch type is specified then
     * the default capacity provider strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem> defaultCapacityProviderStrategy;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to modify the capacity provider settings for. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster to modify the capacity provider settings
     *        for. If you do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to modify the capacity provider settings for. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster to modify the capacity provider settings
     *         for. If you do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to modify the capacity provider settings for. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster to modify the capacity provider settings
     *        for. If you do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutClusterCapacityProvidersRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The name of one or more capacity providers to associate with the cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * 
     * @return The name of one or more capacity providers to associate with the cluster.</p>
     *         <p>
     *         If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *         created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *         </p>
     *         <p>
     *         To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *         <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *         accounts and only need to be associated with a cluster to be used.
     */

    public java.util.List<String> getCapacityProviders() {
        if (capacityProviders == null) {
            capacityProviders = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capacityProviders;
    }

    /**
     * <p>
     * The name of one or more capacity providers to associate with the cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * 
     * @param capacityProviders
     *        The name of one or more capacity providers to associate with the cluster.</p>
     *        <p>
     *        If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *        created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *        </p>
     *        <p>
     *        To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *        accounts and only need to be associated with a cluster to be used.
     */

    public void setCapacityProviders(java.util.Collection<String> capacityProviders) {
        if (capacityProviders == null) {
            this.capacityProviders = null;
            return;
        }

        this.capacityProviders = new com.amazonaws.internal.SdkInternalList<String>(capacityProviders);
    }

    /**
     * <p>
     * The name of one or more capacity providers to associate with the cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityProviders(java.util.Collection)} or {@link #withCapacityProviders(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param capacityProviders
     *        The name of one or more capacity providers to associate with the cluster.</p>
     *        <p>
     *        If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *        created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *        </p>
     *        <p>
     *        To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *        accounts and only need to be associated with a cluster to be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutClusterCapacityProvidersRequest withCapacityProviders(String... capacityProviders) {
        if (this.capacityProviders == null) {
            setCapacityProviders(new com.amazonaws.internal.SdkInternalList<String>(capacityProviders.length));
        }
        for (String ele : capacityProviders) {
            this.capacityProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of one or more capacity providers to associate with the cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * 
     * @param capacityProviders
     *        The name of one or more capacity providers to associate with the cluster.</p>
     *        <p>
     *        If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *        created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *        </p>
     *        <p>
     *        To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *        accounts and only need to be associated with a cluster to be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutClusterCapacityProvidersRequest withCapacityProviders(java.util.Collection<String> capacityProviders) {
        setCapacityProviders(capacityProviders);
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity provider or launch type is specified then
     * the default capacity provider strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * 
     * @return The capacity provider strategy to use by default for the cluster.</p>
     *         <p>
     *         When creating a service or running a task on a cluster, if no capacity provider or launch type is
     *         specified then the default capacity provider strategy for the cluster is used.
     *         </p>
     *         <p>
     *         A capacity provider strategy consists of one or more capacity providers along with the <code>base</code>
     *         and <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be
     *         used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a
     *         capacity provider with a cluster. Only capacity providers with an <code>ACTIVE</code> or
     *         <code>UPDATING</code> status can be used.
     *         </p>
     *         <p>
     *         If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *         created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *         </p>
     *         <p>
     *         To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *         <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *         accounts and only need to be associated with a cluster to be used.
     */

    public java.util.List<CapacityProviderStrategyItem> getDefaultCapacityProviderStrategy() {
        if (defaultCapacityProviderStrategy == null) {
            defaultCapacityProviderStrategy = new com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem>();
        }
        return defaultCapacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity provider or launch type is specified then
     * the default capacity provider strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * 
     * @param defaultCapacityProviderStrategy
     *        The capacity provider strategy to use by default for the cluster.</p>
     *        <p>
     *        When creating a service or running a task on a cluster, if no capacity provider or launch type is
     *        specified then the default capacity provider strategy for the cluster is used.
     *        </p>
     *        <p>
     *        A capacity provider strategy consists of one or more capacity providers along with the <code>base</code>
     *        and <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be
     *        used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a
     *        capacity provider with a cluster. Only capacity providers with an <code>ACTIVE</code> or
     *        <code>UPDATING</code> status can be used.
     *        </p>
     *        <p>
     *        If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *        created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *        </p>
     *        <p>
     *        To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *        accounts and only need to be associated with a cluster to be used.
     */

    public void setDefaultCapacityProviderStrategy(java.util.Collection<CapacityProviderStrategyItem> defaultCapacityProviderStrategy) {
        if (defaultCapacityProviderStrategy == null) {
            this.defaultCapacityProviderStrategy = null;
            return;
        }

        this.defaultCapacityProviderStrategy = new com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem>(defaultCapacityProviderStrategy);
    }

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity provider or launch type is specified then
     * the default capacity provider strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultCapacityProviderStrategy(java.util.Collection)} or
     * {@link #withDefaultCapacityProviderStrategy(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param defaultCapacityProviderStrategy
     *        The capacity provider strategy to use by default for the cluster.</p>
     *        <p>
     *        When creating a service or running a task on a cluster, if no capacity provider or launch type is
     *        specified then the default capacity provider strategy for the cluster is used.
     *        </p>
     *        <p>
     *        A capacity provider strategy consists of one or more capacity providers along with the <code>base</code>
     *        and <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be
     *        used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a
     *        capacity provider with a cluster. Only capacity providers with an <code>ACTIVE</code> or
     *        <code>UPDATING</code> status can be used.
     *        </p>
     *        <p>
     *        If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *        created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *        </p>
     *        <p>
     *        To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *        accounts and only need to be associated with a cluster to be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutClusterCapacityProvidersRequest withDefaultCapacityProviderStrategy(CapacityProviderStrategyItem... defaultCapacityProviderStrategy) {
        if (this.defaultCapacityProviderStrategy == null) {
            setDefaultCapacityProviderStrategy(new com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem>(defaultCapacityProviderStrategy.length));
        }
        for (CapacityProviderStrategyItem ele : defaultCapacityProviderStrategy) {
            this.defaultCapacityProviderStrategy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity provider or launch type is specified then
     * the default capacity provider strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * 
     * @param defaultCapacityProviderStrategy
     *        The capacity provider strategy to use by default for the cluster.</p>
     *        <p>
     *        When creating a service or running a task on a cluster, if no capacity provider or launch type is
     *        specified then the default capacity provider strategy for the cluster is used.
     *        </p>
     *        <p>
     *        A capacity provider strategy consists of one or more capacity providers along with the <code>base</code>
     *        and <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be
     *        used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a
     *        capacity provider with a cluster. Only capacity providers with an <code>ACTIVE</code> or
     *        <code>UPDATING</code> status can be used.
     *        </p>
     *        <p>
     *        If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *        created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *        </p>
     *        <p>
     *        To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *        accounts and only need to be associated with a cluster to be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutClusterCapacityProvidersRequest withDefaultCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> defaultCapacityProviderStrategy) {
        setDefaultCapacityProviderStrategy(defaultCapacityProviderStrategy);
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getCapacityProviders() != null)
            sb.append("CapacityProviders: ").append(getCapacityProviders()).append(",");
        if (getDefaultCapacityProviderStrategy() != null)
            sb.append("DefaultCapacityProviderStrategy: ").append(getDefaultCapacityProviderStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutClusterCapacityProvidersRequest == false)
            return false;
        PutClusterCapacityProvidersRequest other = (PutClusterCapacityProvidersRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getCapacityProviders() == null ^ this.getCapacityProviders() == null)
            return false;
        if (other.getCapacityProviders() != null && other.getCapacityProviders().equals(this.getCapacityProviders()) == false)
            return false;
        if (other.getDefaultCapacityProviderStrategy() == null ^ this.getDefaultCapacityProviderStrategy() == null)
            return false;
        if (other.getDefaultCapacityProviderStrategy() != null
                && other.getDefaultCapacityProviderStrategy().equals(this.getDefaultCapacityProviderStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getCapacityProviders() == null) ? 0 : getCapacityProviders().hashCode());
        hashCode = prime * hashCode + ((getDefaultCapacityProviderStrategy() == null) ? 0 : getDefaultCapacityProviderStrategy().hashCode());
        return hashCode;
    }

    @Override
    public PutClusterCapacityProvidersRequest clone() {
        return (PutClusterCapacityProvidersRequest) super.clone();
    }

}
