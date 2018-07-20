package com.openkappa.panama.vectorbenchmarks;

import jdk.incubator.vector.*;

import java.util.concurrent.ThreadLocalRandom;

public class Util {
  public static float[] newFloatVector(int size) {
    float[] vector = new float[size];
    for (int i = 0; i < vector.length; ++i) {
      vector[i] = ThreadLocalRandom.current().nextFloat();
    }
    return vector;
  }

  public static double[] newDoubleVector(int size) {
    double[] vector = new double[size];
    for (int i = 0; i < vector.length; ++i) {
      vector[i] = ThreadLocalRandom.current().nextDouble();
    }
    return vector;
  }

  public static int[] newIntVector(int size) {
    int[] vector = new int[size];
    for (int i = 0; i < vector.length; ++i) {
      vector[i] = ThreadLocalRandom.current().nextInt();
    }
    return vector;
  }

  public static float[] newFloatRowMajorMatrix(int size) {
    float[] matrix = new float[size * size];
    for (int i = 0; i < matrix.length; ++i) {
      matrix[i] = ThreadLocalRandom.current().nextFloat();
    }
    return matrix;
  }

  public static int[] newIntRowMatrix(int size) {
    int[] matrix = new int[size * size];
    for (int i = 0; i < matrix.length; ++i) {
      matrix[i] = ThreadLocalRandom.current().nextInt();
    }
    return matrix;
  }

  public static int[] newIntBitmap(int size) {
    int[] bitmap = new int[size];
    for (int i = 0; i < bitmap.length; ++i) {
      bitmap[i] = ThreadLocalRandom.current().nextInt();
    }
    return bitmap;
  }

  public static long[] newLongBitmap(int size) {
    long[] bitmap = new long[size];
    for (int i = 0; i < bitmap.length; ++i) {
      bitmap[i] = ThreadLocalRandom.current().nextLong();
    }
    return bitmap;
  }

  public static final IntVector.IntSpecies<Shapes.S128Bit> XMM_INT =
          (IntVector.IntSpecies<Shapes.S128Bit>) Vector.species(int.class, Shapes.S_128_BIT);

  public static final IntVector.IntSpecies<Shapes.S256Bit> YMM_INT =
          (IntVector.IntSpecies<Shapes.S256Bit>) Vector.species(int.class, Shapes.S_256_BIT);

  public static final FloatVector.FloatSpecies<Shapes.S256Bit> YMM_FLOAT =
          (FloatVector.FloatSpecies<Shapes.S256Bit>) Vector.species(float.class, Shapes.S_256_BIT);

  public static final DoubleVector.DoubleSpecies<Shapes.S256Bit> YMM_DOUBLE =
          (DoubleVector.DoubleSpecies<Shapes.S256Bit>) Vector.species(double.class, Shapes.S_256_BIT);

  public static final LongVector.LongSpecies<Shapes.S256Bit> YMM_LONG =
          (LongVector.LongSpecies<Shapes.S256Bit>) Vector.species(long.class, Shapes.S_256_BIT);

  public static final ByteVector.ByteSpecies<Shapes.S256Bit> YMM_BYTE =
          (ByteVector.ByteSpecies<Shapes.S256Bit>) Vector.species(byte.class, Shapes.S_256_BIT);
}
