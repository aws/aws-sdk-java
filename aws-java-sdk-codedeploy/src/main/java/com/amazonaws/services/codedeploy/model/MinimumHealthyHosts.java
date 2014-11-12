/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about minimum healthy instances.
 * </p>
 */
public class MinimumHealthyHosts implements Serializable {

    /**
     * The minimum healthy instances value.
     */
    private Integer value;

    /**
     * The minimum healthy instances type: <ul> <li>HOST_COUNT: The minimum
     * number of healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The minimum number of healthy instances, as a
     * percentage of the total number of instances in the deployment.</li>
     * </ul> <p>For example, for 9 Amazon EC2 instances, if a HOST_COUNT of 6
     * is specified, deploy to up to 3 instances at a time. The deployment
     * succeeds if 6 or more instances are successfully deployed to;
     * otherwise, the deployment fails. If a FLEET_PERCENT of 40 is
     * specified, deploy to up to 5 instances at a time. The deployment
     * succeeds if 4 or more instances are successfully deployed to;
     * otherwise, the deployment fails. <note>In a call to the get deployment
     * configuration operation, CodeDeployDefault.OneAtATime will return a
     * minimum healthy instances type of MOST_CONCURRENCY and a value of 1.
     * This means a deployment to only one Amazon EC2 instance at a time.
     * (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
     * FLEET_PERCENT.)</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOST_COUNT, FLEET_PERCENT
     */
    private String type;

    /**
     * The minimum healthy instances value.
     *
     * @return The minimum healthy instances value.
     */
    public Integer getValue() {
        return value;
    }
    
    /**
     * The minimum healthy instances value.
     *
     * @param value The minimum healthy instances value.
     */
    public void setValue(Integer value) {
        this.value = value;
    }
    
    /**
     * The minimum healthy instances value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The minimum healthy instances value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MinimumHealthyHosts withValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * The minimum healthy instances type: <ul> <li>HOST_COUNT: The minimum
     * number of healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The minimum number of healthy instances, as a
     * percentage of the total number of instances in the deployment.</li>
     * </ul> <p>For example, for 9 Amazon EC2 instances, if a HOST_COUNT of 6
     * is specified, deploy to up to 3 instances at a time. The deployment
     * succeeds if 6 or more instances are successfully deployed to;
     * otherwise, the deployment fails. If a FLEET_PERCENT of 40 is
     * specified, deploy to up to 5 instances at a time. The deployment
     * succeeds if 4 or more instances are successfully deployed to;
     * otherwise, the deployment fails. <note>In a call to the get deployment
     * configuration operation, CodeDeployDefault.OneAtATime will return a
     * minimum healthy instances type of MOST_CONCURRENCY and a value of 1.
     * This means a deployment to only one Amazon EC2 instance at a time.
     * (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
     * FLEET_PERCENT.)</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOST_COUNT, FLEET_PERCENT
     *
     * @return The minimum healthy instances type: <ul> <li>HOST_COUNT: The minimum
     *         number of healthy instances, as an absolute value.</li>
     *         <li>FLEET_PERCENT: The minimum number of healthy instances, as a
     *         percentage of the total number of instances in the deployment.</li>
     *         </ul> <p>For example, for 9 Amazon EC2 instances, if a HOST_COUNT of 6
     *         is specified, deploy to up to 3 instances at a time. The deployment
     *         succeeds if 6 or more instances are successfully deployed to;
     *         otherwise, the deployment fails. If a FLEET_PERCENT of 40 is
     *         specified, deploy to up to 5 instances at a time. The deployment
     *         succeeds if 4 or more instances are successfully deployed to;
     *         otherwise, the deployment fails. <note>In a call to the get deployment
     *         configuration operation, CodeDeployDefault.OneAtATime will return a
     *         minimum healthy instances type of MOST_CONCURRENCY and a value of 1.
     *         This means a deployment to only one Amazon EC2 instance at a time.
     *         (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
     *         FLEET_PERCENT.)</note>
     *
     * @see MinimumHealthyHostsType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The minimum healthy instances type: <ul> <li>HOST_COUNT: The minimum
     * number of healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The minimum number of healthy instances, as a
     * percentage of the total number of instances in the deployment.</li>
     * </ul> <p>For example, for 9 Amazon EC2 instances, if a HOST_COUNT of 6
     * is specified, deploy to up to 3 instances at a time. The deployment
     * succeeds if 6 or more instances are successfully deployed to;
     * otherwise, the deployment fails. If a FLEET_PERCENT of 40 is
     * specified, deploy to up to 5 instances at a time. The deployment
     * succeeds if 4 or more instances are successfully deployed to;
     * otherwise, the deployment fails. <note>In a call to the get deployment
     * configuration operation, CodeDeployDefault.OneAtATime will return a
     * minimum healthy instances type of MOST_CONCURRENCY and a value of 1.
     * This means a deployment to only one Amazon EC2 instance at a time.
     * (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
     * FLEET_PERCENT.)</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOST_COUNT, FLEET_PERCENT
     *
     * @param type The minimum healthy instances type: <ul> <li>HOST_COUNT: The minimum
     *         number of healthy instances, as an absolute value.</li>
     *         <li>FLEET_PERCENT: The minimum number of healthy instances, as a
     *         percentage of the total number of instances in the deployment.</li>
     *         </ul> <p>For example, for 9 Amazon EC2 instances, if a HOST_COUNT of 6
     *         is specified, deploy to up to 3 instances at a time. The deployment
     *         succeeds if 6 or more instances are successfully deployed to;
     *         otherwise, the deployment fails. If a FLEET_PERCENT of 40 is
     *         specified, deploy to up to 5 instances at a time. The deployment
     *         succeeds if 4 or more instances are successfully deployed to;
     *         otherwise, the deployment fails. <note>In a call to the get deployment
     *         configuration operation, CodeDeployDefault.OneAtATime will return a
     *         minimum healthy instances type of MOST_CONCURRENCY and a value of 1.
     *         This means a deployment to only one Amazon EC2 instance at a time.
     *         (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
     *         FLEET_PERCENT.)</note>
     *
     * @see MinimumHealthyHostsType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The minimum healthy instances type: <ul> <li>HOST_COUNT: The minimum
     * number of healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The minimum number of healthy instances, as a
     * percentage of the total number of instances in the deployment.</li>
     * </ul> <p>For example, for 9 Amazon EC2 instances, if a HOST_COUNT of 6
     * is specified, deploy to up to 3 instances at a time. The deployment
     * succeeds if 6 or more instances are successfully deployed to;
     * otherwise, the deployment fails. If a FLEET_PERCENT of 40 is
     * specified, deploy to up to 5 instances at a time. The deployment
     * succeeds if 4 or more instances are successfully deployed to;
     * otherwise, the deployment fails. <note>In a call to the get deployment
     * configuration operation, CodeDeployDefault.OneAtATime will return a
     * minimum healthy instances type of MOST_CONCURRENCY and a value of 1.
     * This means a deployment to only one Amazon EC2 instance at a time.
     * (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
     * FLEET_PERCENT.)</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOST_COUNT, FLEET_PERCENT
     *
     * @param type The minimum healthy instances type: <ul> <li>HOST_COUNT: The minimum
     *         number of healthy instances, as an absolute value.</li>
     *         <li>FLEET_PERCENT: The minimum number of healthy instances, as a
     *         percentage of the total number of instances in the deployment.</li>
     *         </ul> <p>For example, for 9 Amazon EC2 instances, if a HOST_COUNT of 6
     *         is specified, deploy to up to 3 instances at a time. The deployment
     *         succeeds if 6 or more instances are successfully deployed to;
     *         otherwise, the deployment fails. If a FLEET_PERCENT of 40 is
     *         specified, deploy to up to 5 instances at a time. The deployment
     *         succeeds if 4 or more instances are successfully deployed to;
     *         otherwise, the deployment fails. <note>In a call to the get deployment
     *         configuration operation, CodeDeployDefault.OneAtATime will return a
     *         minimum healthy instances type of MOST_CONCURRENCY and a value of 1.
     *         This means a deployment to only one Amazon EC2 instance at a time.
     *         (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
     *         FLEET_PERCENT.)</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MinimumHealthyHostsType
     */
    public MinimumHealthyHosts withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The minimum healthy instances type: <ul> <li>HOST_COUNT: The minimum
     * number of healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The minimum number of healthy instances, as a
     * percentage of the total number of instances in the deployment.</li>
     * </ul> <p>For example, for 9 Amazon EC2 instances, if a HOST_COUNT of 6
     * is specified, deploy to up to 3 instances at a time. The deployment
     * succeeds if 6 or more instances are successfully deployed to;
     * otherwise, the deployment fails. If a FLEET_PERCENT of 40 is
     * specified, deploy to up to 5 instances at a time. The deployment
     * succeeds if 4 or more instances are successfully deployed to;
     * otherwise, the deployment fails. <note>In a call to the get deployment
     * configuration operation, CodeDeployDefault.OneAtATime will return a
     * minimum healthy instances type of MOST_CONCURRENCY and a value of 1.
     * This means a deployment to only one Amazon EC2 instance at a time.
     * (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
     * FLEET_PERCENT.)</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOST_COUNT, FLEET_PERCENT
     *
     * @param type The minimum healthy instances type: <ul> <li>HOST_COUNT: The minimum
     *         number of healthy instances, as an absolute value.</li>
     *         <li>FLEET_PERCENT: The minimum number of healthy instances, as a
     *         percentage of the total number of instances in the deployment.</li>
     *         </ul> <p>For example, for 9 Amazon EC2 instances, if a HOST_COUNT of 6
     *         is specified, deploy to up to 3 instances at a time. The deployment
     *         succeeds if 6 or more instances are successfully deployed to;
     *         otherwise, the deployment fails. If a FLEET_PERCENT of 40 is
     *         specified, deploy to up to 5 instances at a time. The deployment
     *         succeeds if 4 or more instances are successfully deployed to;
     *         otherwise, the deployment fails. <note>In a call to the get deployment
     *         configuration operation, CodeDeployDefault.OneAtATime will return a
     *         minimum healthy instances type of MOST_CONCURRENCY and a value of 1.
     *         This means a deployment to only one Amazon EC2 instance at a time.
     *         (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
     *         FLEET_PERCENT.)</note>
     *
     * @see MinimumHealthyHostsType
     */
    public void setType(MinimumHealthyHostsType type) {
        this.type = type.toString();
    }
    
    /**
     * The minimum healthy instances type: <ul> <li>HOST_COUNT: The minimum
     * number of healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The minimum number of healthy instances, as a
     * percentage of the total number of instances in the deployment.</li>
     * </ul> <p>For example, for 9 Amazon EC2 instances, if a HOST_COUNT of 6
     * is specified, deploy to up to 3 instances at a time. The deployment
     * succeeds if 6 or more instances are successfully deployed to;
     * otherwise, the deployment fails. If a FLEET_PERCENT of 40 is
     * specified, deploy to up to 5 instances at a time. The deployment
     * succeeds if 4 or more instances are successfully deployed to;
     * otherwise, the deployment fails. <note>In a call to the get deployment
     * configuration operation, CodeDeployDefault.OneAtATime will return a
     * minimum healthy instances type of MOST_CONCURRENCY and a value of 1.
     * This means a deployment to only one Amazon EC2 instance at a time.
     * (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
     * FLEET_PERCENT.)</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOST_COUNT, FLEET_PERCENT
     *
     * @param type The minimum healthy instances type: <ul> <li>HOST_COUNT: The minimum
     *         number of healthy instances, as an absolute value.</li>
     *         <li>FLEET_PERCENT: The minimum number of healthy instances, as a
     *         percentage of the total number of instances in the deployment.</li>
     *         </ul> <p>For example, for 9 Amazon EC2 instances, if a HOST_COUNT of 6
     *         is specified, deploy to up to 3 instances at a time. The deployment
     *         succeeds if 6 or more instances are successfully deployed to;
     *         otherwise, the deployment fails. If a FLEET_PERCENT of 40 is
     *         specified, deploy to up to 5 instances at a time. The deployment
     *         succeeds if 4 or more instances are successfully deployed to;
     *         otherwise, the deployment fails. <note>In a call to the get deployment
     *         configuration operation, CodeDeployDefault.OneAtATime will return a
     *         minimum healthy instances type of MOST_CONCURRENCY and a value of 1.
     *         This means a deployment to only one Amazon EC2 instance at a time.
     *         (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
     *         FLEET_PERCENT.)</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MinimumHealthyHostsType
     */
    public MinimumHealthyHosts withType(MinimumHealthyHostsType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (getType() != null) sb.append("Type: " + getType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MinimumHealthyHosts == false) return false;
        MinimumHealthyHosts other = (MinimumHealthyHosts)obj;
        
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        return true;
    }
    
}
    