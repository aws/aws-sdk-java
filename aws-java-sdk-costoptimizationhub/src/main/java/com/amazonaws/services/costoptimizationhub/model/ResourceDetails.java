/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains detailed information about the specified resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ResourceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Compute Savings Plans recommendation details.
     * </p>
     */
    private ComputeSavingsPlans computeSavingsPlans;
    /**
     * <p>
     * The Amazon Elastic Block Store volume recommendation details.
     * </p>
     */
    private EbsVolume ebsVolume;
    /**
     * <p>
     * The EC2 Auto Scaling group recommendation details.
     * </p>
     */
    private Ec2AutoScalingGroup ec2AutoScalingGroup;
    /**
     * <p>
     * The EC2 instance recommendation details.
     * </p>
     */
    private Ec2Instance ec2Instance;
    /**
     * <p>
     * The EC2 instance Savings Plans recommendation details.
     * </p>
     */
    private Ec2InstanceSavingsPlans ec2InstanceSavingsPlans;
    /**
     * <p>
     * The EC2 reserved instances recommendation details.
     * </p>
     */
    private Ec2ReservedInstances ec2ReservedInstances;
    /**
     * <p>
     * The ECS service recommendation details.
     * </p>
     */
    private EcsService ecsService;
    /**
     * <p>
     * The ElastiCache reserved instances recommendation details.
     * </p>
     */
    private ElastiCacheReservedInstances elastiCacheReservedInstances;
    /**
     * <p>
     * The Lambda function recommendation details.
     * </p>
     */
    private LambdaFunction lambdaFunction;
    /**
     * <p>
     * The OpenSearch reserved instances recommendation details.
     * </p>
     */
    private OpenSearchReservedInstances openSearchReservedInstances;
    /**
     * <p>
     * The RDS reserved instances recommendation details.
     * </p>
     */
    private RdsReservedInstances rdsReservedInstances;
    /**
     * <p>
     * The Redshift reserved instances recommendation details.
     * </p>
     */
    private RedshiftReservedInstances redshiftReservedInstances;
    /**
     * <p>
     * The SageMaker Savings Plans recommendation details.
     * </p>
     */
    private SageMakerSavingsPlans sageMakerSavingsPlans;

    /**
     * <p>
     * The Compute Savings Plans recommendation details.
     * </p>
     * 
     * @param computeSavingsPlans
     *        The Compute Savings Plans recommendation details.
     */

    public void setComputeSavingsPlans(ComputeSavingsPlans computeSavingsPlans) {
        this.computeSavingsPlans = computeSavingsPlans;
    }

    /**
     * <p>
     * The Compute Savings Plans recommendation details.
     * </p>
     * 
     * @return The Compute Savings Plans recommendation details.
     */

    public ComputeSavingsPlans getComputeSavingsPlans() {
        return this.computeSavingsPlans;
    }

    /**
     * <p>
     * The Compute Savings Plans recommendation details.
     * </p>
     * 
     * @param computeSavingsPlans
     *        The Compute Savings Plans recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withComputeSavingsPlans(ComputeSavingsPlans computeSavingsPlans) {
        setComputeSavingsPlans(computeSavingsPlans);
        return this;
    }

    /**
     * <p>
     * The Amazon Elastic Block Store volume recommendation details.
     * </p>
     * 
     * @param ebsVolume
     *        The Amazon Elastic Block Store volume recommendation details.
     */

    public void setEbsVolume(EbsVolume ebsVolume) {
        this.ebsVolume = ebsVolume;
    }

    /**
     * <p>
     * The Amazon Elastic Block Store volume recommendation details.
     * </p>
     * 
     * @return The Amazon Elastic Block Store volume recommendation details.
     */

    public EbsVolume getEbsVolume() {
        return this.ebsVolume;
    }

    /**
     * <p>
     * The Amazon Elastic Block Store volume recommendation details.
     * </p>
     * 
     * @param ebsVolume
     *        The Amazon Elastic Block Store volume recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withEbsVolume(EbsVolume ebsVolume) {
        setEbsVolume(ebsVolume);
        return this;
    }

    /**
     * <p>
     * The EC2 Auto Scaling group recommendation details.
     * </p>
     * 
     * @param ec2AutoScalingGroup
     *        The EC2 Auto Scaling group recommendation details.
     */

    public void setEc2AutoScalingGroup(Ec2AutoScalingGroup ec2AutoScalingGroup) {
        this.ec2AutoScalingGroup = ec2AutoScalingGroup;
    }

    /**
     * <p>
     * The EC2 Auto Scaling group recommendation details.
     * </p>
     * 
     * @return The EC2 Auto Scaling group recommendation details.
     */

    public Ec2AutoScalingGroup getEc2AutoScalingGroup() {
        return this.ec2AutoScalingGroup;
    }

    /**
     * <p>
     * The EC2 Auto Scaling group recommendation details.
     * </p>
     * 
     * @param ec2AutoScalingGroup
     *        The EC2 Auto Scaling group recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withEc2AutoScalingGroup(Ec2AutoScalingGroup ec2AutoScalingGroup) {
        setEc2AutoScalingGroup(ec2AutoScalingGroup);
        return this;
    }

    /**
     * <p>
     * The EC2 instance recommendation details.
     * </p>
     * 
     * @param ec2Instance
     *        The EC2 instance recommendation details.
     */

    public void setEc2Instance(Ec2Instance ec2Instance) {
        this.ec2Instance = ec2Instance;
    }

    /**
     * <p>
     * The EC2 instance recommendation details.
     * </p>
     * 
     * @return The EC2 instance recommendation details.
     */

    public Ec2Instance getEc2Instance() {
        return this.ec2Instance;
    }

    /**
     * <p>
     * The EC2 instance recommendation details.
     * </p>
     * 
     * @param ec2Instance
     *        The EC2 instance recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withEc2Instance(Ec2Instance ec2Instance) {
        setEc2Instance(ec2Instance);
        return this;
    }

    /**
     * <p>
     * The EC2 instance Savings Plans recommendation details.
     * </p>
     * 
     * @param ec2InstanceSavingsPlans
     *        The EC2 instance Savings Plans recommendation details.
     */

    public void setEc2InstanceSavingsPlans(Ec2InstanceSavingsPlans ec2InstanceSavingsPlans) {
        this.ec2InstanceSavingsPlans = ec2InstanceSavingsPlans;
    }

    /**
     * <p>
     * The EC2 instance Savings Plans recommendation details.
     * </p>
     * 
     * @return The EC2 instance Savings Plans recommendation details.
     */

    public Ec2InstanceSavingsPlans getEc2InstanceSavingsPlans() {
        return this.ec2InstanceSavingsPlans;
    }

    /**
     * <p>
     * The EC2 instance Savings Plans recommendation details.
     * </p>
     * 
     * @param ec2InstanceSavingsPlans
     *        The EC2 instance Savings Plans recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withEc2InstanceSavingsPlans(Ec2InstanceSavingsPlans ec2InstanceSavingsPlans) {
        setEc2InstanceSavingsPlans(ec2InstanceSavingsPlans);
        return this;
    }

    /**
     * <p>
     * The EC2 reserved instances recommendation details.
     * </p>
     * 
     * @param ec2ReservedInstances
     *        The EC2 reserved instances recommendation details.
     */

    public void setEc2ReservedInstances(Ec2ReservedInstances ec2ReservedInstances) {
        this.ec2ReservedInstances = ec2ReservedInstances;
    }

    /**
     * <p>
     * The EC2 reserved instances recommendation details.
     * </p>
     * 
     * @return The EC2 reserved instances recommendation details.
     */

    public Ec2ReservedInstances getEc2ReservedInstances() {
        return this.ec2ReservedInstances;
    }

    /**
     * <p>
     * The EC2 reserved instances recommendation details.
     * </p>
     * 
     * @param ec2ReservedInstances
     *        The EC2 reserved instances recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withEc2ReservedInstances(Ec2ReservedInstances ec2ReservedInstances) {
        setEc2ReservedInstances(ec2ReservedInstances);
        return this;
    }

    /**
     * <p>
     * The ECS service recommendation details.
     * </p>
     * 
     * @param ecsService
     *        The ECS service recommendation details.
     */

    public void setEcsService(EcsService ecsService) {
        this.ecsService = ecsService;
    }

    /**
     * <p>
     * The ECS service recommendation details.
     * </p>
     * 
     * @return The ECS service recommendation details.
     */

    public EcsService getEcsService() {
        return this.ecsService;
    }

    /**
     * <p>
     * The ECS service recommendation details.
     * </p>
     * 
     * @param ecsService
     *        The ECS service recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withEcsService(EcsService ecsService) {
        setEcsService(ecsService);
        return this;
    }

    /**
     * <p>
     * The ElastiCache reserved instances recommendation details.
     * </p>
     * 
     * @param elastiCacheReservedInstances
     *        The ElastiCache reserved instances recommendation details.
     */

    public void setElastiCacheReservedInstances(ElastiCacheReservedInstances elastiCacheReservedInstances) {
        this.elastiCacheReservedInstances = elastiCacheReservedInstances;
    }

    /**
     * <p>
     * The ElastiCache reserved instances recommendation details.
     * </p>
     * 
     * @return The ElastiCache reserved instances recommendation details.
     */

    public ElastiCacheReservedInstances getElastiCacheReservedInstances() {
        return this.elastiCacheReservedInstances;
    }

    /**
     * <p>
     * The ElastiCache reserved instances recommendation details.
     * </p>
     * 
     * @param elastiCacheReservedInstances
     *        The ElastiCache reserved instances recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withElastiCacheReservedInstances(ElastiCacheReservedInstances elastiCacheReservedInstances) {
        setElastiCacheReservedInstances(elastiCacheReservedInstances);
        return this;
    }

    /**
     * <p>
     * The Lambda function recommendation details.
     * </p>
     * 
     * @param lambdaFunction
     *        The Lambda function recommendation details.
     */

    public void setLambdaFunction(LambdaFunction lambdaFunction) {
        this.lambdaFunction = lambdaFunction;
    }

    /**
     * <p>
     * The Lambda function recommendation details.
     * </p>
     * 
     * @return The Lambda function recommendation details.
     */

    public LambdaFunction getLambdaFunction() {
        return this.lambdaFunction;
    }

    /**
     * <p>
     * The Lambda function recommendation details.
     * </p>
     * 
     * @param lambdaFunction
     *        The Lambda function recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withLambdaFunction(LambdaFunction lambdaFunction) {
        setLambdaFunction(lambdaFunction);
        return this;
    }

    /**
     * <p>
     * The OpenSearch reserved instances recommendation details.
     * </p>
     * 
     * @param openSearchReservedInstances
     *        The OpenSearch reserved instances recommendation details.
     */

    public void setOpenSearchReservedInstances(OpenSearchReservedInstances openSearchReservedInstances) {
        this.openSearchReservedInstances = openSearchReservedInstances;
    }

    /**
     * <p>
     * The OpenSearch reserved instances recommendation details.
     * </p>
     * 
     * @return The OpenSearch reserved instances recommendation details.
     */

    public OpenSearchReservedInstances getOpenSearchReservedInstances() {
        return this.openSearchReservedInstances;
    }

    /**
     * <p>
     * The OpenSearch reserved instances recommendation details.
     * </p>
     * 
     * @param openSearchReservedInstances
     *        The OpenSearch reserved instances recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withOpenSearchReservedInstances(OpenSearchReservedInstances openSearchReservedInstances) {
        setOpenSearchReservedInstances(openSearchReservedInstances);
        return this;
    }

    /**
     * <p>
     * The RDS reserved instances recommendation details.
     * </p>
     * 
     * @param rdsReservedInstances
     *        The RDS reserved instances recommendation details.
     */

    public void setRdsReservedInstances(RdsReservedInstances rdsReservedInstances) {
        this.rdsReservedInstances = rdsReservedInstances;
    }

    /**
     * <p>
     * The RDS reserved instances recommendation details.
     * </p>
     * 
     * @return The RDS reserved instances recommendation details.
     */

    public RdsReservedInstances getRdsReservedInstances() {
        return this.rdsReservedInstances;
    }

    /**
     * <p>
     * The RDS reserved instances recommendation details.
     * </p>
     * 
     * @param rdsReservedInstances
     *        The RDS reserved instances recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withRdsReservedInstances(RdsReservedInstances rdsReservedInstances) {
        setRdsReservedInstances(rdsReservedInstances);
        return this;
    }

    /**
     * <p>
     * The Redshift reserved instances recommendation details.
     * </p>
     * 
     * @param redshiftReservedInstances
     *        The Redshift reserved instances recommendation details.
     */

    public void setRedshiftReservedInstances(RedshiftReservedInstances redshiftReservedInstances) {
        this.redshiftReservedInstances = redshiftReservedInstances;
    }

    /**
     * <p>
     * The Redshift reserved instances recommendation details.
     * </p>
     * 
     * @return The Redshift reserved instances recommendation details.
     */

    public RedshiftReservedInstances getRedshiftReservedInstances() {
        return this.redshiftReservedInstances;
    }

    /**
     * <p>
     * The Redshift reserved instances recommendation details.
     * </p>
     * 
     * @param redshiftReservedInstances
     *        The Redshift reserved instances recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withRedshiftReservedInstances(RedshiftReservedInstances redshiftReservedInstances) {
        setRedshiftReservedInstances(redshiftReservedInstances);
        return this;
    }

    /**
     * <p>
     * The SageMaker Savings Plans recommendation details.
     * </p>
     * 
     * @param sageMakerSavingsPlans
     *        The SageMaker Savings Plans recommendation details.
     */

    public void setSageMakerSavingsPlans(SageMakerSavingsPlans sageMakerSavingsPlans) {
        this.sageMakerSavingsPlans = sageMakerSavingsPlans;
    }

    /**
     * <p>
     * The SageMaker Savings Plans recommendation details.
     * </p>
     * 
     * @return The SageMaker Savings Plans recommendation details.
     */

    public SageMakerSavingsPlans getSageMakerSavingsPlans() {
        return this.sageMakerSavingsPlans;
    }

    /**
     * <p>
     * The SageMaker Savings Plans recommendation details.
     * </p>
     * 
     * @param sageMakerSavingsPlans
     *        The SageMaker Savings Plans recommendation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withSageMakerSavingsPlans(SageMakerSavingsPlans sageMakerSavingsPlans) {
        setSageMakerSavingsPlans(sageMakerSavingsPlans);
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
        if (getComputeSavingsPlans() != null)
            sb.append("ComputeSavingsPlans: ").append(getComputeSavingsPlans()).append(",");
        if (getEbsVolume() != null)
            sb.append("EbsVolume: ").append(getEbsVolume()).append(",");
        if (getEc2AutoScalingGroup() != null)
            sb.append("Ec2AutoScalingGroup: ").append(getEc2AutoScalingGroup()).append(",");
        if (getEc2Instance() != null)
            sb.append("Ec2Instance: ").append(getEc2Instance()).append(",");
        if (getEc2InstanceSavingsPlans() != null)
            sb.append("Ec2InstanceSavingsPlans: ").append(getEc2InstanceSavingsPlans()).append(",");
        if (getEc2ReservedInstances() != null)
            sb.append("Ec2ReservedInstances: ").append(getEc2ReservedInstances()).append(",");
        if (getEcsService() != null)
            sb.append("EcsService: ").append(getEcsService()).append(",");
        if (getElastiCacheReservedInstances() != null)
            sb.append("ElastiCacheReservedInstances: ").append(getElastiCacheReservedInstances()).append(",");
        if (getLambdaFunction() != null)
            sb.append("LambdaFunction: ").append(getLambdaFunction()).append(",");
        if (getOpenSearchReservedInstances() != null)
            sb.append("OpenSearchReservedInstances: ").append(getOpenSearchReservedInstances()).append(",");
        if (getRdsReservedInstances() != null)
            sb.append("RdsReservedInstances: ").append(getRdsReservedInstances()).append(",");
        if (getRedshiftReservedInstances() != null)
            sb.append("RedshiftReservedInstances: ").append(getRedshiftReservedInstances()).append(",");
        if (getSageMakerSavingsPlans() != null)
            sb.append("SageMakerSavingsPlans: ").append(getSageMakerSavingsPlans());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDetails == false)
            return false;
        ResourceDetails other = (ResourceDetails) obj;
        if (other.getComputeSavingsPlans() == null ^ this.getComputeSavingsPlans() == null)
            return false;
        if (other.getComputeSavingsPlans() != null && other.getComputeSavingsPlans().equals(this.getComputeSavingsPlans()) == false)
            return false;
        if (other.getEbsVolume() == null ^ this.getEbsVolume() == null)
            return false;
        if (other.getEbsVolume() != null && other.getEbsVolume().equals(this.getEbsVolume()) == false)
            return false;
        if (other.getEc2AutoScalingGroup() == null ^ this.getEc2AutoScalingGroup() == null)
            return false;
        if (other.getEc2AutoScalingGroup() != null && other.getEc2AutoScalingGroup().equals(this.getEc2AutoScalingGroup()) == false)
            return false;
        if (other.getEc2Instance() == null ^ this.getEc2Instance() == null)
            return false;
        if (other.getEc2Instance() != null && other.getEc2Instance().equals(this.getEc2Instance()) == false)
            return false;
        if (other.getEc2InstanceSavingsPlans() == null ^ this.getEc2InstanceSavingsPlans() == null)
            return false;
        if (other.getEc2InstanceSavingsPlans() != null && other.getEc2InstanceSavingsPlans().equals(this.getEc2InstanceSavingsPlans()) == false)
            return false;
        if (other.getEc2ReservedInstances() == null ^ this.getEc2ReservedInstances() == null)
            return false;
        if (other.getEc2ReservedInstances() != null && other.getEc2ReservedInstances().equals(this.getEc2ReservedInstances()) == false)
            return false;
        if (other.getEcsService() == null ^ this.getEcsService() == null)
            return false;
        if (other.getEcsService() != null && other.getEcsService().equals(this.getEcsService()) == false)
            return false;
        if (other.getElastiCacheReservedInstances() == null ^ this.getElastiCacheReservedInstances() == null)
            return false;
        if (other.getElastiCacheReservedInstances() != null && other.getElastiCacheReservedInstances().equals(this.getElastiCacheReservedInstances()) == false)
            return false;
        if (other.getLambdaFunction() == null ^ this.getLambdaFunction() == null)
            return false;
        if (other.getLambdaFunction() != null && other.getLambdaFunction().equals(this.getLambdaFunction()) == false)
            return false;
        if (other.getOpenSearchReservedInstances() == null ^ this.getOpenSearchReservedInstances() == null)
            return false;
        if (other.getOpenSearchReservedInstances() != null && other.getOpenSearchReservedInstances().equals(this.getOpenSearchReservedInstances()) == false)
            return false;
        if (other.getRdsReservedInstances() == null ^ this.getRdsReservedInstances() == null)
            return false;
        if (other.getRdsReservedInstances() != null && other.getRdsReservedInstances().equals(this.getRdsReservedInstances()) == false)
            return false;
        if (other.getRedshiftReservedInstances() == null ^ this.getRedshiftReservedInstances() == null)
            return false;
        if (other.getRedshiftReservedInstances() != null && other.getRedshiftReservedInstances().equals(this.getRedshiftReservedInstances()) == false)
            return false;
        if (other.getSageMakerSavingsPlans() == null ^ this.getSageMakerSavingsPlans() == null)
            return false;
        if (other.getSageMakerSavingsPlans() != null && other.getSageMakerSavingsPlans().equals(this.getSageMakerSavingsPlans()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputeSavingsPlans() == null) ? 0 : getComputeSavingsPlans().hashCode());
        hashCode = prime * hashCode + ((getEbsVolume() == null) ? 0 : getEbsVolume().hashCode());
        hashCode = prime * hashCode + ((getEc2AutoScalingGroup() == null) ? 0 : getEc2AutoScalingGroup().hashCode());
        hashCode = prime * hashCode + ((getEc2Instance() == null) ? 0 : getEc2Instance().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceSavingsPlans() == null) ? 0 : getEc2InstanceSavingsPlans().hashCode());
        hashCode = prime * hashCode + ((getEc2ReservedInstances() == null) ? 0 : getEc2ReservedInstances().hashCode());
        hashCode = prime * hashCode + ((getEcsService() == null) ? 0 : getEcsService().hashCode());
        hashCode = prime * hashCode + ((getElastiCacheReservedInstances() == null) ? 0 : getElastiCacheReservedInstances().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunction() == null) ? 0 : getLambdaFunction().hashCode());
        hashCode = prime * hashCode + ((getOpenSearchReservedInstances() == null) ? 0 : getOpenSearchReservedInstances().hashCode());
        hashCode = prime * hashCode + ((getRdsReservedInstances() == null) ? 0 : getRdsReservedInstances().hashCode());
        hashCode = prime * hashCode + ((getRedshiftReservedInstances() == null) ? 0 : getRedshiftReservedInstances().hashCode());
        hashCode = prime * hashCode + ((getSageMakerSavingsPlans() == null) ? 0 : getSageMakerSavingsPlans().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDetails clone() {
        try {
            return (ResourceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.ResourceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
