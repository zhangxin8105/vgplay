/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.vgplay.core;

public class GiCorePlay {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GiCorePlay(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiCorePlay obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        vgplayJNI.delete_GiCorePlay(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GiCorePlay(int coreView) {
    this(vgplayJNI.new_GiCorePlay(coreView), true);
  }

  public static int getVersion() {
    return vgplayJNI.GiCorePlay_getVersion();
  }

  public int loadFirstFrame() {
    return vgplayJNI.GiCorePlay_loadFirstFrame__SWIG_0(swigCPtr, this);
  }

  public int loadFirstFrame(String file) {
    return vgplayJNI.GiCorePlay_loadFirstFrame__SWIG_1(swigCPtr, this, file);
  }

  public int loadNextFrame(int index) {
    return vgplayJNI.GiCorePlay_loadNextFrame__SWIG_0(swigCPtr, this, index);
  }

  public int loadPrevFrame(int index, int curTick) {
    return vgplayJNI.GiCorePlay_loadPrevFrame(swigCPtr, this, index, curTick);
  }

  public void applyFrame(int flags) {
    vgplayJNI.GiCorePlay_applyFrame__SWIG_0(swigCPtr, this, flags);
  }

  public static void applyFrame(int coreView, int playing, int flags) {
    vgplayJNI.GiCorePlay_applyFrame__SWIG_1(coreView, playing, flags);
  }

  public static boolean loadFrameIndex(String path, Ints arr) {
    return vgplayJNI.GiCorePlay_loadFrameIndex(path, Ints.getCPtr(arr), arr);
  }

  public int loadNextFrame(Ints head, int curTick) {
    return vgplayJNI.GiCorePlay_loadNextFrame__SWIG_1(swigCPtr, this, Ints.getCPtr(head), head, curTick);
  }

  public int skipExpireFrame(Ints head, int index, int curTick) {
    return vgplayJNI.GiCorePlay_skipExpireFrame(swigCPtr, this, Ints.getCPtr(head), head, index, curTick);
  }

  public boolean frameNeedWait(int curTick) {
    return vgplayJNI.GiCorePlay_frameNeedWait(swigCPtr, this, curTick);
  }

  public final static int DOC_CHANGED = vgplayJNI.GiCorePlay_DOC_CHANGED_get();
  public final static int SHAPE_APPEND = vgplayJNI.GiCorePlay_SHAPE_APPEND_get();
  public final static int DYN_CHANGED = vgplayJNI.GiCorePlay_DYN_CHANGED_get();

}
