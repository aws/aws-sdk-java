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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#createDeploymentGroup(CreateDeploymentGroupRequest) CreateDeploymentGroup operation}.
 * <p>
 * Creates a new deployment group for application revisions to be
 * deployed to.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#createDeploymentGroup(CreateDeploymentGroupRequest)
 */
public class CreateDeploymentGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The name of an existing deployment group for the specified
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentGroupName;

    /**
     * If specified, the deployment configuration name must be one of the
     * predefined values, or it can be a custom deployment configuration:
     * <ul> <li>CodeDeployDefault.AllAtOnce deploys an application revision
     * to up to all of the Amazon EC2 instances at once. The overall
     * deployment succeeds if the application revision deploys to at least
     * one of the instances. The overall deployment fails after the
     * application revision fails to deploy to all of the instances. For
     * example, for 9 instances, deploy to up to all 9 instances at once. The
     * overall deployment succeeds if any of the 9 instances is successfully
     * deployed to, and it fails if all 9 instances fail to be deployed
     * to.</li> <li>CodeDeployDefault.HalfAtATime deploys to up to half of
     * the instances at a time (with fractions rounded down). The overall
     * deployment succeeds if the application revision deploys to at least
     * half of the instances (with fractions rounded up); otherwise, the
     * deployment fails. For example, for 9 instances, deploy to up to 4
     * instances at a time. The overall deployment succeeds if 5 or more
     * instances are successfully deployed to; otherwise, the deployment
     * fails. Note that the deployment may successfully deploy to some
     * instances, even if the overall deployment fails.</li>
     * <li>CodeDeployDefault.OneAtATime deploys the application revision to
     * only one of the instances at a time. The overall deployment succeeds
     * if the application revision deploys to all of the instances. The
     * overall deployment fails after the application revision first fails to
     * deploy to any one instance. For example, for 9 instances, deploy to
     * one instance at a time. The overall deployment succeeds if all 9
     * instances are successfully deployed to, and it fails if any of one of
     * the 9 instances fail to be deployed to. Note that the deployment may
     * successfully deploy to some instances, even if the overall deployment
     * fails. This is the default deployment configuration if a configuration
     * isn't specified for either the deployment or the deployment
     * group.</li> </ul> <p>To create a custom deployment configuration, call
     * the create deployment configuration operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentConfigName;

    /**
     * The Amazon EC2 tags to filter on.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter> ec2TagFilters;

    /**
     * A list of associated Auto Scaling groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingGroups;

    /**
     * A service role ARN that allows AWS CodeDeploy to act on the user's
     * behalf when interacting with AWS services.
     */
    private String serviceRoleArn;

    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentGroupRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The name of an existing deployment group for the specified
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of an existing deployment group for the specified
     *         application.
     */
    public String getDeploymentGroupName() {
        return deploymentGroupName;
    }
    
    /**
     * The name of an existing deployment group for the specified
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName The name of an existing deployment group for the specified
     *         application.
     */
    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }
    
    /**
     * The name of an existing deployment group for the specified
     * application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName The name of an existing deployment group for the specified
     *         application.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentGroupRequest withDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
        return this;
    }

    /**
     * If specified, the deployment configuration name must be one of the
     * predefined values, or it can be a custom deployment configuration:
     * <ul> <li>CodeDeployDefault.AllAtOnce deploys an application revision
     * to up to all of the Amazon EC2 instances at once. The overall
     * deployment succeeds if the application revision deploys to at least
     * one of the instances. The overall deployment fails after the
     * application revision fails to deploy to all of the instances. For
     * example, for 9 instances, deploy to up to all 9 instances at once. The
     * overall deployment succeeds if any of the 9 instances is successfully
     * deployed to, and it fails if all 9 instances fail to be deployed
     * to.</li> <li>CodeDeployDefault.HalfAtATime deploys to up to half of
     * the instances at a time (with fractions rounded down). The overall
     * deployment succeeds if the application revision deploys to at least
     * half of the instances (with fractions rounded up); otherwise, the
     * deployment fails. For example, for 9 instances, deploy to up to 4
     * instances at a time. The overall deployment succeeds if 5 or more
     * instances are successfully deployed to; otherwise, the deployment
     * fails. Note that the deployment may successfully deploy to some
     * instances, even if the overall deployment fails.</li>
     * <li>CodeDeployDefault.OneAtATime deploys the application revision to
     * only one of the instances at a time. The overall deployment succeeds
     * if the application revision deploys to all of the instances. The
     * overall deployment fails after the application revision first fails to
     * deploy to any one instance. For example, for 9 instances, deploy to
     * one instance at a time. The overall deployment succeeds if all 9
     * instances are successfully deployed to, and it fails if any of one of
     * the 9 instances fail to be deployed to. Note that the deployment may
     * successfully deploy to some instances, even if the overall deployment
     * fails. This is the default deployment configuration if a configuration
     * isn't specified for either the deployment or the deployment
     * group.</li> </ul> <p>To create a custom deployment configuration, call
     * the create deployment configuration operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return If specified, the deployment configuration name must be one of the
     *         predefined values, or it can be a custom deployment configuration:
     *         <ul> <li>CodeDeployDefault.AllAtOnce deploys an application revision
     *         to up to all of the Amazon EC2 instances at once. The overall
     *         deployment succeeds if the application revision deploys to at least
     *         one of the instances. The overall deployment fails after the
     *         application revision fails to deploy to all of the instances. For
     *         example, for 9 instances, deploy to up to all 9 instances at once. The
     *         overall deployment succeeds if any of the 9 instances is successfully
     *         deployed to, and it fails if all 9 instances fail to be deployed
     *         to.</li> <li>CodeDeployDefault.HalfAtATime deploys to up to half of
     *         the instances at a time (with fractions rounded down). The overall
     *         deployment succeeds if the application revision deploys to at least
     *         half of the instances (with fractions rounded up); otherwise, the
     *         deployment fails. For example, for 9 instances, deploy to up to 4
     *         instances at a time. The overall deployment succeeds if 5 or more
     *         instances are successfully deployed to; otherwise, the deployment
     *         fails. Note that the deployment may successfully deploy to some
     *         instances, even if the overall deployment fails.</li>
     *         <li>CodeDeployDefault.OneAtATime deploys the application revision to
     *         only one of the instances at a time. The overall deployment succeeds
     *         if the application revision deploys to all of the instances. The
     *         overall deployment fails after the application revision first fails to
     *         deploy to any one instance. For example, for 9 instances, deploy to
     *         one instance at a time. The overall deployment succeeds if all 9
     *         instances are successfully deployed to, and it fails if any of one of
     *         the 9 instances fail to be deployed to. Note that the deployment may
     *         successfully deploy to some instances, even if the overall deployment
     *         fails. This is the default deployment configuration if a configuration
     *         isn't specified for either the deployment or the deployment
     *         group.</li> </ul> <p>To create a custom deployment configuration, call
     *         the create deployment configuration operation.
     */
    public String getDeploymentConfigName() {
        return deploymentConfigName;
    }
    
    /**
     * If specified, the deployment configuration name must be one of the
     * predefined values, or it can be a custom deployment configuration:
     * <ul> <li>CodeDeployDefault.AllAtOnce deploys an application revision
     * to up to all of the Amazon EC2 instances at once. The overall
     * deployment succeeds if the application revision deploys to at least
     * one of the instances. The overall deployment fails after the
     * application revision fails to deploy to all of the instances. For
     * example, for 9 instances, deploy to up to all 9 instances at once. The
     * overall deployment succeeds if any of the 9 instances is successfully
     * deployed to, and it fails if all 9 instances fail to be deployed
     * to.</li> <li>CodeDeployDefault.HalfAtATime deploys to up to half of
     * the instances at a time (with fractions rounded down). The overall
     * deployment succeeds if the application revision deploys to at least
     * half of the instances (with fractions rounded up); otherwise, the
     * deployment fails. For example, for 9 instances, deploy to up to 4
     * instances at a time. The overall deployment succeeds if 5 or more
     * instances are successfully deployed to; otherwise, the deployment
     * fails. Note that the deployment may successfully deploy to some
     * instances, even if the overall deployment fails.</li>
     * <li>CodeDeployDefault.OneAtATime deploys the application revision to
     * only one of the instances at a time. The overall deployment succeeds
     * if the application revision deploys to all of the instances. The
     * overall deployment fails after the application revision first fails to
     * deploy to any one instance. For example, for 9 instances, deploy to
     * one instance at a time. The overall deployment succeeds if all 9
     * instances are successfully deployed to, and it fails if any of one of
     * the 9 instances fail to be deployed to. Note that the deployment may
     * successfully deploy to some instances, even if the overall deployment
     * fails. This is the default deployment configuration if a configuration
     * isn't specified for either the deployment or the deployment
     * group.</li> </ul> <p>To create a custom deployment configuration, call
     * the create deployment configuration operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName If specified, the deployment configuration name must be one of the
     *         predefined values, or it can be a custom deployment configuration:
     *         <ul> <li>CodeDeployDefault.AllAtOnce deploys an application revision
     *         to up to all of the Amazon EC2 instances at once. The overall
     *         deployment succeeds if the application revision deploys to at least
     *         one of the instances. The overall deployment fails after the
     *         application revision fails to deploy to all of the instances. For
     *         example, for 9 instances, deploy to up to all 9 instances at once. The
     *         overall deployment succeeds if any of the 9 instances is successfully
     *         deployed to, and it fails if all 9 instances fail to be deployed
     *         to.</li> <li>CodeDeployDefault.HalfAtATime deploys to up to half of
     *         the instances at a time (with fractions rounded down). The overall
     *         deployment succeeds if the application revision deploys to at least
     *         half of the instances (with fractions rounded up); otherwise, the
     *         deployment fails. For example, for 9 instances, deploy to up to 4
     *         instances at a time. The overall deployment succeeds if 5 or more
     *         instances are successfully deployed to; otherwise, the deployment
     *         fails. Note that the deployment may successfully deploy to some
     *         instances, even if the overall deployment fails.</li>
     *         <li>CodeDeployDefault.OneAtATime deploys the application revision to
     *         only one of the instances at a time. The overall deployment succeeds
     *         if the application revision deploys to all of the instances. The
     *         overall deployment fails after the application revision first fails to
     *         deploy to any one instance. For example, for 9 instances, deploy to
     *         one instance at a time. The overall deployment succeeds if all 9
     *         instances are successfully deployed to, and it fails if any of one of
     *         the 9 instances fail to be deployed to. Note that the deployment may
     *         successfully deploy to some instances, even if the overall deployment
     *         fails. This is the default deployment configuration if a configuration
     *         isn't specified for either the deployment or the deployment
     *         group.</li> </ul> <p>To create a custom deployment configuration, call
     *         the create deployment configuration operation.
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }
    
    /**
     * If specified, the deployment configuration name must be one of the
     * predefined values, or it can be a custom deployment configuration:
     * <ul> <li>CodeDeployDefault.AllAtOnce deploys an application revision
     * to up to all of the Amazon EC2 instances at once. The overall
     * deployment succeeds if the application revision deploys to at least
     * one of the instances. The overall deployment fails after the
     * application revision fails to deploy to all of the instances. For
     * example, for 9 instances, deploy to up to all 9 instances at once. The
     * overall deployment succeeds if any of the 9 instances is successfully
     * deployed to, and it fails if all 9 instances fail to be deployed
     * to.</li> <li>CodeDeployDefault.HalfAtATime deploys to up to half of
     * the instances at a time (with fractions rounded down). The overall
     * deployment succeeds if the application revision deploys to at least
     * half of the instances (with fractions rounded up); otherwise, the
     * deployment fails. For example, for 9 instances, deploy to up to 4
     * instances at a time. The overall deployment succeeds if 5 or more
     * instances are successfully deployed to; otherwise, the deployment
     * fails. Note that the deployment may successfully deploy to some
     * instances, even if the overall deployment fails.</li>
     * <li>CodeDeployDefault.OneAtATime deploys the application revision to
     * only one of the instances at a time. The overall deployment succeeds
     * if the application revision deploys to all of the instances. The
     * overall deployment fails after the application revision first fails to
     * deploy to any one instance. For example, for 9 instances, deploy to
     * one instance at a time. The overall deployment succeeds if all 9
     * instances are successfully deployed to, and it fails if any of one of
     * the 9 instances fail to be deployed to. Note that the deployment may
     * successfully deploy to some instances, even if the overall deployment
     * fails. This is the default deployment configuration if a configuration
     * isn't specified for either the deployment or the deployment
     * group.</li> </ul> <p>To create a custom deployment configuration, call
     * the create deployment configuration operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName If specified, the deployment configuration name must be one of the
     *         predefined values, or it can be a custom deployment configuration:
     *         <ul> <li>CodeDeployDefault.AllAtOnce deploys an application revision
     *         to up to all of the Amazon EC2 instances at once. The overall
     *         deployment succeeds if the application revision deploys to at least
     *         one of the instances. The overall deployment fails after the
     *         application revision fails to deploy to all of the instances. For
     *         example, for 9 instances, deploy to up to all 9 instances at once. The
     *         overall deployment succeeds if any of the 9 instances is successfully
     *         deployed to, and it fails if all 9 instances fail to be deployed
     *         to.</li> <li>CodeDeployDefault.HalfAtATime deploys to up to half of
     *         the instances at a time (with fractions rounded down). The overall
     *         deployment succeeds if the application revision deploys to at least
     *         half of the instances (with fractions rounded up); otherwise, the
     *         deployment fails. For example, for 9 instances, deploy to up to 4
     *         instances at a time. The overall deployment succeeds if 5 or more
     *         instances are successfully deployed to; otherwise, the deployment
     *         fails. Note that the deployment may successfully deploy to some
     *         instances, even if the overall deployment fails.</li>
     *         <li>CodeDeployDefault.OneAtATime deploys the application revision to
     *         only one of the instances at a time. The overall deployment succeeds
     *         if the application revision deploys to all of the instances. The
     *         overall deployment fails after the application revision first fails to
     *         deploy to any one instance. For example, for 9 instances, deploy to
     *         one instance at a time. The overall deployment succeeds if all 9
     *         instances are successfully deployed to, and it fails if any of one of
     *         the 9 instances fail to be deployed to. Note that the deployment may
     *         successfully deploy to some instances, even if the overall deployment
     *         fails. This is the default deployment configuration if a configuration
     *         isn't specified for either the deployment or the deployment
     *         group.</li> </ul> <p>To create a custom deployment configuration, call
     *         the create deployment configuration operation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentGroupRequest withDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * The Amazon EC2 tags to filter on.
     *
     * @return The Amazon EC2 tags to filter on.
     */
    public java.util.List<EC2TagFilter> getEc2TagFilters() {
        if (ec2TagFilters == null) {
              ec2TagFilters = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter>();
              ec2TagFilters.setAutoConstruct(true);
        }
        return ec2TagFilters;
    }
    
    /**
     * The Amazon EC2 tags to filter on.
     *
     * @param ec2TagFilters The Amazon EC2 tags to filter on.
     */
    public void setEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
        if (ec2TagFilters == null) {
            this.ec2TagFilters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter> ec2TagFiltersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter>(ec2TagFilters.size());
        ec2TagFiltersCopy.addAll(ec2TagFilters);
        this.ec2TagFilters = ec2TagFiltersCopy;
    }
    
    /**
     * The Amazon EC2 tags to filter on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2TagFilters The Amazon EC2 tags to filter on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentGroupRequest withEc2TagFilters(EC2TagFilter... ec2TagFilters) {
        if (getEc2TagFilters() == null) setEc2TagFilters(new java.util.ArrayList<EC2TagFilter>(ec2TagFilters.length));
        for (EC2TagFilter value : ec2TagFilters) {
            getEc2TagFilters().add(value);
        }
        return this;
    }
    
    /**
     * The Amazon EC2 tags to filter on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2TagFilters The Amazon EC2 tags to filter on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentGroupRequest withEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
        if (ec2TagFilters == null) {
            this.ec2TagFilters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter> ec2TagFiltersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter>(ec2TagFilters.size());
            ec2TagFiltersCopy.addAll(ec2TagFilters);
            this.ec2TagFilters = ec2TagFiltersCopy;
        }

        return this;
    }

    /**
     * A list of associated Auto Scaling groups.
     *
     * @return A list of associated Auto Scaling groups.
     */
    public java.util.List<String> getAutoScalingGroups() {
        if (autoScalingGroups == null) {
              autoScalingGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              autoScalingGroups.setAutoConstruct(true);
        }
        return autoScalingGroups;
    }
    
    /**
     * A list of associated Auto Scaling groups.
     *
     * @param autoScalingGroups A list of associated Auto Scaling groups.
     */
    public void setAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(autoScalingGroups.size());
        autoScalingGroupsCopy.addAll(autoScalingGroups);
        this.autoScalingGroups = autoScalingGroupsCopy;
    }
    
    /**
     * A list of associated Auto Scaling groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroups A list of associated Auto Scaling groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentGroupRequest withAutoScalingGroups(String... autoScalingGroups) {
        if (getAutoScalingGroups() == null) setAutoScalingGroups(new java.util.ArrayList<String>(autoScalingGroups.length));
        for (String value : autoScalingGroups) {
            getAutoScalingGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of associated Auto Scaling groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroups A list of associated Auto Scaling groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentGroupRequest withAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(autoScalingGroups.size());
            autoScalingGroupsCopy.addAll(autoScalingGroups);
            this.autoScalingGroups = autoScalingGroupsCopy;
        }

        return this;
    }

    /**
     * A service role ARN that allows AWS CodeDeploy to act on the user's
     * behalf when interacting with AWS services.
     *
     * @return A service role ARN that allows AWS CodeDeploy to act on the user's
     *         behalf when interacting with AWS services.
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }
    
    /**
     * A service role ARN that allows AWS CodeDeploy to act on the user's
     * behalf when interacting with AWS services.
     *
     * @param serviceRoleArn A service role ARN that allows AWS CodeDeploy to act on the user's
     *         behalf when interacting with AWS services.
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }
    
    /**
     * A service role ARN that allows AWS CodeDeploy to act on the user's
     * behalf when interacting with AWS services.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceRoleArn A service role ARN that allows AWS CodeDeploy to act on the user's
     *         behalf when interacting with AWS services.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentGroupRequest withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
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
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDeploymentGroupName() != null) sb.append("DeploymentGroupName: " + getDeploymentGroupName() + ",");
        if (getDeploymentConfigName() != null) sb.append("DeploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getEc2TagFilters() != null) sb.append("Ec2TagFilters: " + getEc2TagFilters() + ",");
        if (getAutoScalingGroups() != null) sb.append("AutoScalingGroups: " + getAutoScalingGroups() + ",");
        if (getServiceRoleArn() != null) sb.append("ServiceRoleArn: " + getServiceRoleArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentGroupName() == null) ? 0 : getDeploymentGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode()); 
        hashCode = prime * hashCode + ((getEc2TagFilters() == null) ? 0 : getEc2TagFilters().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode()); 
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDeploymentGroupRequest == false) return false;
        CreateDeploymentGroupRequest other = (CreateDeploymentGroupRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null) return false;
        if (other.getDeploymentGroupName() != null && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false) return false; 
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null) return false;
        if (other.getDeploymentConfigName() != null && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false) return false; 
        if (other.getEc2TagFilters() == null ^ this.getEc2TagFilters() == null) return false;
        if (other.getEc2TagFilters() != null && other.getEc2TagFilters().equals(this.getEc2TagFilters()) == false) return false; 
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null) return false;
        if (other.getAutoScalingGroups() != null && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false) return false; 
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null) return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false) return false; 
        return true;
    }
    
}
    