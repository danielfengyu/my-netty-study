/**
 * @author    fengyu
 * @filename  2016年6月9日-UnsignedTest.java
 * @time      下午5:42:22
 * @classname UnsignedTest
 */
package com.fengyu.study.netty;

import java.nio.ByteBuffer;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author fengyu
 * @time 2016年6月9日::下午5:42:22
 *
 */
public class UnsignedTest
{
	@Test
	public void testGetUnsignedByte()
	{
		final ByteBuffer bb = ByteBuffer.allocate( 10 ).put( 0, (byte) 12 );
		System.out.println( Unsigned.getUnsignedByte( bb ) );
		Assert.assertEquals( (long) 12, Unsigned.getUnsignedByte( bb ) );
	}
}
