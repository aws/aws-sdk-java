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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> clusters;
    /**
     * <p>
     * Additional information about your clusters to be separated by launch type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * runningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> include;

    /**
     * <p>
     * A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * 
     * @return A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not
     *         specify a cluster, the default cluster is assumed.
     */

    public java.util.List<String> getClusters() {
        if (clusters == null) {
            clusters = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return clusters;
    }

    /**
     * <p>
     * A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * 
     * @param clusters
     *        A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not
     *        specify a cluster, the default cluster is assumed.
     */

    public void setClusters(java.util.Collection<String> clusters) {
        if (clusters == null) {
            this.clusters = null;
            return;
        }

        this.clusters = new com.amazonaws.internal.SdkInternalList<String>(clusters);
    }

    /**
     * <p>
     * A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusters(java.util.Collection)} or {@link #withClusters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param clusters
     *        A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not
     *        specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withClusters(String... clusters) {
        if (this.clusters == null) {
            setClusters(new com.amazonaws.internal.SdkInternalList<String>(clusters.length));
        }
        for (String ele : clusters) {
            this.clusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * 
     * @param clusters
     *        A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not
     *        specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withClusters(java.util.Collection<String> clusters) {
        setClusters(clusters);
        return this;
    }

    /**
     * <p>
     * Additional information about your clusters to be separated by launch type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * runningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * 
     * @return Additional information about your clusters to be separated by launch type, including:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         runningEC2TasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         runningFargateTasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         pendingEC2TasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         pendingFargateTasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         activeEC2ServiceCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         activeFargateServiceCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         drainingEC2ServiceCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         drainingFargateServiceCount
     *         </p>
     *         </li>
     * @see ClusterField
     */

    public java.util.List<String> getInclude() {
        if (include == null) {
            include = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return include;
    }

    /**
     * <p>
     * Additional information about your clusters to be separated by launch type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * runningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * 
     * @param include
     *        Additional information about your clusters to be separated by launch type, including:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        runningEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        runningFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeFargateServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingFargateServiceCount
     *        </p>
     *        </li>
     * @see ClusterField
     */

    public void setInclude(java.util.Collection<String> include) {
        if (include == null) {
            this.include = null;
            return;
        }

        this.include = new com.amazonaws.internal.SdkInternalList<String>(include);
    }

    /**
     * <p>
     * Additional information about your clusters to be separated by launch type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * runningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclude(java.util.Collection)} or {@link #withInclude(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param include
     *        Additional information about your clusters to be separated by launch type, including:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        runningEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        runningFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeFargateServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingFargateServiceCount
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterField
     */

    public DescribeClustersRequest withInclude(String... include) {
        if (this.include == null) {
            setInclude(new com.amazonaws.internal.SdkInternalList<String>(include.length));
        }
        for (String ele : include) {
            this.include.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional information about your clusters to be separated by launch type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * runningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * 
     * @param include
     *        Additional information about your clusters to be separated by launch type, including:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        runningEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        runningFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeFargateServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingFargateServiceCount
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterField
     */

    public DescribeClustersRequest withInclude(java.util.Collection<String> include) {
        setInclude(include);
        return this;
    }

    /**
     * <p>
     * Additional information about your clusters to be separated by launch type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * runningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * 
     * @param include
     *        Additional information about your clusters to be separated by launch type, including:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        runningEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        runningFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeFargateServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingFargateServiceCount
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterField
     */

    public DescribeClustersRequest withInclude(ClusterField... include) {
        com.amazonaws.internal.SdkInternalList<String> includeCopy = new com.amazonaws.internal.SdkInternalList<String>(include.length);
        for (ClusterField value : include) {
            includeCopy.add(value.toString());
        }
        if (getInclude() == null) {
            setInclude(includeCopy);
        } else {
            getInclude().addAll(includeCopy);
        }
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
        if (getClusters() != null)
            sb.append("Clusters: ").append(getClusters()).append(",");
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClustersRequest == false)
            return false;
        DescribeClustersRequest other = (DescribeClustersRequest) obj;
        if (other.getClusters() == null ^ this.getClusters() == null)
            return false;
        if (other.getClusters() != null && other.getClusters().equals(this.getClusters()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusters() == null) ? 0 : getClusters().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClustersRequest clone() {
        return (DescribeClustersRequest) super.clone();
    }

}
