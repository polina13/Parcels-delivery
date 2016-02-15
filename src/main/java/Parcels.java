public class Parcels {
  private int mHeight;
  private int mWidth;
  private int mLength;
  private int mWeight;
  private int mDistance;

  public Parcels(int height, int width, int length, int weight, int distance) {
    mHeight = height;
    mWidth = width;
    mLength = length;
    mWeight = weight;
    mDistance = distance;
  }

  public int getVolume(){
    return mHeight * mWidth * mLength;
  }

  public int getCost() {
    return ((mDistance / 50) + (mWeight * 1) + getVolume())/2;
  }
}
