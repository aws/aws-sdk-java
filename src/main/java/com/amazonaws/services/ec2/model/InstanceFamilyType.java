package com.amazonaws.services.ec2.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Enumerations of {@link InstanceFamily} as described in:
 * 
 * <a href="http://aws.amazon.com/ec2/instance-types/instance-details/">http://
 * aws.amazon.com/ec2/instance-types/instance-details/</a>
 * 
 * @see InstanceFamily
 */
public enum InstanceFamilyType implements InstanceFamily {

	GeneralPurpose("General Purpose", InstanceType.M1Small, InstanceType.M1Medium, InstanceType.M1Large,
			InstanceType.M1Xlarge, InstanceType.M3Xlarge, InstanceType.M32xlarge),

	ComputeOptimized("Compute Optimized", InstanceType.C1Medium, InstanceType.C1Xlarge, InstanceType.Cc14xlarge,
			InstanceType.Cc28xlarge),

	MemoryOptimized("Memory Optimized", InstanceType.M22xlarge, InstanceType.M24xlarge, InstanceType.M2Xlarge,
			InstanceType.Cr18xlarge),

	StorageOptimized("Storage Optimized", InstanceType.Hi14xlarge, InstanceType.Hs18xlarge),

	MicroInstances("Micro Instances", InstanceType.T1Micro),

	GPUInstances("GPU Instances", InstanceType.Cg14xlarge);

	private final String name;
	private final Collection<InstanceType> instanceTypes = new HashSet<InstanceType>();

	private InstanceFamilyType(String name, InstanceType... instanceTypes) {
		this.name = name;
		if (instanceTypes != null && instanceTypes.length > 0) {
			this.instanceTypes.addAll(Arrays.asList(instanceTypes));
		}
	}

	public String getName() {
		return name;
	}

	public Collection<InstanceType> getInstanceTypes() {
		return instanceTypes;
	}

	@Override
	public String toString() {
		return name;
	}

	/**
	 * @param instanceType
	 * @return The {@link InstanceFamily} of the instance type; or {@code null}
	 *         if no associated family can be determined.
	 */
	public static InstanceFamily valueOf(InstanceType instanceType) {
		for (InstanceFamily family : values()) {
			if (family.getInstanceTypes().contains(instanceType)) {
				return family;
			}
		}
		return null;
	}

}
