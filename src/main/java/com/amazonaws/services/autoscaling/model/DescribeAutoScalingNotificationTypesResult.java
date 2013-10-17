/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;


/**
 * <p>
 * The <code>AutoScalingNotificationTypes</code> data type.
 * </p>
 */
public class DescribeAutoScalingNotificationTypesResult implements Serializable {

    /**
     * Returns a list of all notification types supported by Auto Scaling.
     * They are: <ul>
     * <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code></li>
     * <li><p><code>autoscaling:TEST_NOTIFICATION</code></li> </ul>
     * <examples>
     * <queryrequest>https://autoscaling.&api-domain;/?Version=2011-01-01&Action=DescribeAutoScalingNotificationTypes
     * &AUTHPARAMS </queryrequest>
     * <queryresponse><DescribeAutoScalingNotificationTypesResponse
     * xmlns="http://autoscaling.&api-domain;/doc/2011-01-01/">
     * <DescribeAutoScalingNotificationTypesResult>
     * <AutoScalingNotificationTypes>
     * <member>autoscaling:EC2_INSTANCE_LAUNCH</member>
     * <member>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</member>
     * <member>autoscaling:EC2_INSTANCE_TERMINATE</member>
     * <member>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</member>
     * <member>autoscaling:TEST_NOTIFICATION</member>
     * </AutoScalingNotificationTypes>
     * </DescribeAutoScalingNotificationTypesResult> <ResponseMetadata>
     * <RequestId>42fc6794-bf21-11e2-a1cf-ff3dEXAMPLE</RequestId>
     * </ResponseMetadata>
     * </DescribeAutoScalingNotificationTypesResponse></queryresponse>
     * </examples>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingNotificationTypes;

    /**
     * Returns a list of all notification types supported by Auto Scaling.
     * They are: <ul>
     * <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code></li>
     * <li><p><code>autoscaling:TEST_NOTIFICATION</code></li> </ul>
     * <examples>
     * <queryrequest>https://autoscaling.&api-domain;/?Version=2011-01-01&Action=DescribeAutoScalingNotificationTypes
     * &AUTHPARAMS </queryrequest>
     * <queryresponse><DescribeAutoScalingNotificationTypesResponse
     * xmlns="http://autoscaling.&api-domain;/doc/2011-01-01/">
     * <DescribeAutoScalingNotificationTypesResult>
     * <AutoScalingNotificationTypes>
     * <member>autoscaling:EC2_INSTANCE_LAUNCH</member>
     * <member>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</member>
     * <member>autoscaling:EC2_INSTANCE_TERMINATE</member>
     * <member>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</member>
     * <member>autoscaling:TEST_NOTIFICATION</member>
     * </AutoScalingNotificationTypes>
     * </DescribeAutoScalingNotificationTypesResult> <ResponseMetadata>
     * <RequestId>42fc6794-bf21-11e2-a1cf-ff3dEXAMPLE</RequestId>
     * </ResponseMetadata>
     * </DescribeAutoScalingNotificationTypesResponse></queryresponse>
     * </examples>
     *
     * @return Returns a list of all notification types supported by Auto Scaling.
     *         They are: <ul>
     *         <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH</code></li>
     *         <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code></li>
     *         <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE</code></li>
     *         <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code></li>
     *         <li><p><code>autoscaling:TEST_NOTIFICATION</code></li> </ul>
     *         <examples>
     *         <queryrequest>https://autoscaling.&api-domain;/?Version=2011-01-01&Action=DescribeAutoScalingNotificationTypes
     *         &AUTHPARAMS </queryrequest>
     *         <queryresponse><DescribeAutoScalingNotificationTypesResponse
     *         xmlns="http://autoscaling.&api-domain;/doc/2011-01-01/">
     *         <DescribeAutoScalingNotificationTypesResult>
     *         <AutoScalingNotificationTypes>
     *         <member>autoscaling:EC2_INSTANCE_LAUNCH</member>
     *         <member>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</member>
     *         <member>autoscaling:EC2_INSTANCE_TERMINATE</member>
     *         <member>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</member>
     *         <member>autoscaling:TEST_NOTIFICATION</member>
     *         </AutoScalingNotificationTypes>
     *         </DescribeAutoScalingNotificationTypesResult> <ResponseMetadata>
     *         <RequestId>42fc6794-bf21-11e2-a1cf-ff3dEXAMPLE</RequestId>
     *         </ResponseMetadata>
     *         </DescribeAutoScalingNotificationTypesResponse></queryresponse>
     *         </examples>
     */
    public java.util.List<String> getAutoScalingNotificationTypes() {
        if (autoScalingNotificationTypes == null) {
              autoScalingNotificationTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              autoScalingNotificationTypes.setAutoConstruct(true);
        }
        return autoScalingNotificationTypes;
    }
    
    /**
     * Returns a list of all notification types supported by Auto Scaling.
     * They are: <ul>
     * <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code></li>
     * <li><p><code>autoscaling:TEST_NOTIFICATION</code></li> </ul>
     * <examples>
     * <queryrequest>https://autoscaling.&api-domain;/?Version=2011-01-01&Action=DescribeAutoScalingNotificationTypes
     * &AUTHPARAMS </queryrequest>
     * <queryresponse><DescribeAutoScalingNotificationTypesResponse
     * xmlns="http://autoscaling.&api-domain;/doc/2011-01-01/">
     * <DescribeAutoScalingNotificationTypesResult>
     * <AutoScalingNotificationTypes>
     * <member>autoscaling:EC2_INSTANCE_LAUNCH</member>
     * <member>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</member>
     * <member>autoscaling:EC2_INSTANCE_TERMINATE</member>
     * <member>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</member>
     * <member>autoscaling:TEST_NOTIFICATION</member>
     * </AutoScalingNotificationTypes>
     * </DescribeAutoScalingNotificationTypesResult> <ResponseMetadata>
     * <RequestId>42fc6794-bf21-11e2-a1cf-ff3dEXAMPLE</RequestId>
     * </ResponseMetadata>
     * </DescribeAutoScalingNotificationTypesResponse></queryresponse>
     * </examples>
     *
     * @param autoScalingNotificationTypes Returns a list of all notification types supported by Auto Scaling.
     *         They are: <ul>
     *         <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH</code></li>
     *         <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code></li>
     *         <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE</code></li>
     *         <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code></li>
     *         <li><p><code>autoscaling:TEST_NOTIFICATION</code></li> </ul>
     *         <examples>
     *         <queryrequest>https://autoscaling.&api-domain;/?Version=2011-01-01&Action=DescribeAutoScalingNotificationTypes
     *         &AUTHPARAMS </queryrequest>
     *         <queryresponse><DescribeAutoScalingNotificationTypesResponse
     *         xmlns="http://autoscaling.&api-domain;/doc/2011-01-01/">
     *         <DescribeAutoScalingNotificationTypesResult>
     *         <AutoScalingNotificationTypes>
     *         <member>autoscaling:EC2_INSTANCE_LAUNCH</member>
     *         <member>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</member>
     *         <member>autoscaling:EC2_INSTANCE_TERMINATE</member>
     *         <member>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</member>
     *         <member>autoscaling:TEST_NOTIFICATION</member>
     *         </AutoScalingNotificationTypes>
     *         </DescribeAutoScalingNotificationTypesResult> <ResponseMetadata>
     *         <RequestId>42fc6794-bf21-11e2-a1cf-ff3dEXAMPLE</RequestId>
     *         </ResponseMetadata>
     *         </DescribeAutoScalingNotificationTypesResponse></queryresponse>
     *         </examples>
     */
    public void setAutoScalingNotificationTypes(java.util.Collection<String> autoScalingNotificationTypes) {
        if (autoScalingNotificationTypes == null) {
            this.autoScalingNotificationTypes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingNotificationTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(autoScalingNotificationTypes.size());
        autoScalingNotificationTypesCopy.addAll(autoScalingNotificationTypes);
        this.autoScalingNotificationTypes = autoScalingNotificationTypesCopy;
    }
    
    /**
     * Returns a list of all notification types supported by Auto Scaling.
     * They are: <ul>
     * <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code></li>
     * <li><p><code>autoscaling:TEST_NOTIFICATION</code></li> </ul>
     * <examples>
     * <queryrequest>https://autoscaling.&api-domain;/?Version=2011-01-01&Action=DescribeAutoScalingNotificationTypes
     * &AUTHPARAMS </queryrequest>
     * <queryresponse><DescribeAutoScalingNotificationTypesResponse
     * xmlns="http://autoscaling.&api-domain;/doc/2011-01-01/">
     * <DescribeAutoScalingNotificationTypesResult>
     * <AutoScalingNotificationTypes>
     * <member>autoscaling:EC2_INSTANCE_LAUNCH</member>
     * <member>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</member>
     * <member>autoscaling:EC2_INSTANCE_TERMINATE</member>
     * <member>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</member>
     * <member>autoscaling:TEST_NOTIFICATION</member>
     * </AutoScalingNotificationTypes>
     * </DescribeAutoScalingNotificationTypesResult> <ResponseMetadata>
     * <RequestId>42fc6794-bf21-11e2-a1cf-ff3dEXAMPLE</RequestId>
     * </ResponseMetadata>
     * </DescribeAutoScalingNotificationTypesResponse></queryresponse>
     * </examples>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingNotificationTypes Returns a list of all notification types supported by Auto Scaling.
     *         They are: <ul>
     *         <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH</code></li>
     *         <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code></li>
     *         <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE</code></li>
     *         <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code></li>
     *         <li><p><code>autoscaling:TEST_NOTIFICATION</code></li> </ul>
     *         <examples>
     *         <queryrequest>https://autoscaling.&api-domain;/?Version=2011-01-01&Action=DescribeAutoScalingNotificationTypes
     *         &AUTHPARAMS </queryrequest>
     *         <queryresponse><DescribeAutoScalingNotificationTypesResponse
     *         xmlns="http://autoscaling.&api-domain;/doc/2011-01-01/">
     *         <DescribeAutoScalingNotificationTypesResult>
     *         <AutoScalingNotificationTypes>
     *         <member>autoscaling:EC2_INSTANCE_LAUNCH</member>
     *         <member>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</member>
     *         <member>autoscaling:EC2_INSTANCE_TERMINATE</member>
     *         <member>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</member>
     *         <member>autoscaling:TEST_NOTIFICATION</member>
     *         </AutoScalingNotificationTypes>
     *         </DescribeAutoScalingNotificationTypesResult> <ResponseMetadata>
     *         <RequestId>42fc6794-bf21-11e2-a1cf-ff3dEXAMPLE</RequestId>
     *         </ResponseMetadata>
     *         </DescribeAutoScalingNotificationTypesResponse></queryresponse>
     *         </examples>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAutoScalingNotificationTypesResult withAutoScalingNotificationTypes(String... autoScalingNotificationTypes) {
        if (getAutoScalingNotificationTypes() == null) setAutoScalingNotificationTypes(new java.util.ArrayList<String>(autoScalingNotificationTypes.length));
        for (String value : autoScalingNotificationTypes) {
            getAutoScalingNotificationTypes().add(value);
        }
        return this;
    }
    
    /**
     * Returns a list of all notification types supported by Auto Scaling.
     * They are: <ul>
     * <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE</code></li>
     * <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code></li>
     * <li><p><code>autoscaling:TEST_NOTIFICATION</code></li> </ul>
     * <examples>
     * <queryrequest>https://autoscaling.&api-domain;/?Version=2011-01-01&Action=DescribeAutoScalingNotificationTypes
     * &AUTHPARAMS </queryrequest>
     * <queryresponse><DescribeAutoScalingNotificationTypesResponse
     * xmlns="http://autoscaling.&api-domain;/doc/2011-01-01/">
     * <DescribeAutoScalingNotificationTypesResult>
     * <AutoScalingNotificationTypes>
     * <member>autoscaling:EC2_INSTANCE_LAUNCH</member>
     * <member>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</member>
     * <member>autoscaling:EC2_INSTANCE_TERMINATE</member>
     * <member>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</member>
     * <member>autoscaling:TEST_NOTIFICATION</member>
     * </AutoScalingNotificationTypes>
     * </DescribeAutoScalingNotificationTypesResult> <ResponseMetadata>
     * <RequestId>42fc6794-bf21-11e2-a1cf-ff3dEXAMPLE</RequestId>
     * </ResponseMetadata>
     * </DescribeAutoScalingNotificationTypesResponse></queryresponse>
     * </examples>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingNotificationTypes Returns a list of all notification types supported by Auto Scaling.
     *         They are: <ul>
     *         <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH</code></li>
     *         <li><p><code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code></li>
     *         <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE</code></li>
     *         <li><p><code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code></li>
     *         <li><p><code>autoscaling:TEST_NOTIFICATION</code></li> </ul>
     *         <examples>
     *         <queryrequest>https://autoscaling.&api-domain;/?Version=2011-01-01&Action=DescribeAutoScalingNotificationTypes
     *         &AUTHPARAMS </queryrequest>
     *         <queryresponse><DescribeAutoScalingNotificationTypesResponse
     *         xmlns="http://autoscaling.&api-domain;/doc/2011-01-01/">
     *         <DescribeAutoScalingNotificationTypesResult>
     *         <AutoScalingNotificationTypes>
     *         <member>autoscaling:EC2_INSTANCE_LAUNCH</member>
     *         <member>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</member>
     *         <member>autoscaling:EC2_INSTANCE_TERMINATE</member>
     *         <member>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</member>
     *         <member>autoscaling:TEST_NOTIFICATION</member>
     *         </AutoScalingNotificationTypes>
     *         </DescribeAutoScalingNotificationTypesResult> <ResponseMetadata>
     *         <RequestId>42fc6794-bf21-11e2-a1cf-ff3dEXAMPLE</RequestId>
     *         </ResponseMetadata>
     *         </DescribeAutoScalingNotificationTypesResponse></queryresponse>
     *         </examples>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAutoScalingNotificationTypesResult withAutoScalingNotificationTypes(java.util.Collection<String> autoScalingNotificationTypes) {
        if (autoScalingNotificationTypes == null) {
            this.autoScalingNotificationTypes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingNotificationTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(autoScalingNotificationTypes.size());
            autoScalingNotificationTypesCopy.addAll(autoScalingNotificationTypes);
            this.autoScalingNotificationTypes = autoScalingNotificationTypesCopy;
        }

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
        if (getAutoScalingNotificationTypes() != null) sb.append("AutoScalingNotificationTypes: " + getAutoScalingNotificationTypes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingNotificationTypes() == null) ? 0 : getAutoScalingNotificationTypes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAutoScalingNotificationTypesResult == false) return false;
        DescribeAutoScalingNotificationTypesResult other = (DescribeAutoScalingNotificationTypesResult)obj;
        
        if (other.getAutoScalingNotificationTypes() == null ^ this.getAutoScalingNotificationTypes() == null) return false;
        if (other.getAutoScalingNotificationTypes() != null && other.getAutoScalingNotificationTypes().equals(this.getAutoScalingNotificationTypes()) == false) return false; 
        return true;
    }
    
}
    