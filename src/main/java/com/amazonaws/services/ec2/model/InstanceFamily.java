package com.amazonaws.services.ec2.model;

import java.util.Collection;

/**
 * An abstraction of the family of the instances such as processing bound or I/O
 * bound. Based on the categorization of Amazon AWS instance families, there are
 * different families of instances that are <b>optimized</b> for certain class
 * of operations such as computation, storage or I/O.
 * 
 * @see InstanceType
 */
public interface InstanceFamily {

	/**
	 * @return The name of the instance family such as {@code GPU}.
	 */
	String getName();

	/**
	 * @return A {@link Collection} of {@link InstanceType}s of this instance
	 *         family. The result can be empty but not {@code null}.
	 */
	Collection<InstanceType> getInstanceTypes();

}
