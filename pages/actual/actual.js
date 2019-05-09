// pages/actual/actual.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    order: [
      { orderid: 109,
        menfu:1,
        qiechang:34,
        zhang:230,
        kun:23,
        pokuan1:22,
        pokuan2:23,
        pokuan3:24,
      }, 
      {
        orderid: 110,
        menfu: 2,
        qiechang: 34,
        zhang: 230,
        kun: 23,
        pokuan1: 22,
        pokuan2: 23,
        pokuan3: 24,
      },  
      {
        orderid: 111,
        menfu: 3,
        qiechang: 34,
        zhang: 230,
        kun: 23,
        pokuan1: 22,
        pokuan2: 23,
        pokuan3: 24,
      }, 
    ],
    list01: [
      { item_id: 11 }, { item_id: 11 }, { item_id: 11 }
    ],
    list02: [

    ],
    list03: [
      { item_id: 11 }, { item_id: 11 }
    ],
    list04: [
      { item_id: 11 }, { item_id: 11 }, { item_id: 11 }
    ],

    // 展开折叠
    selectedFlag: [false,false,false,false,false,false,false,false,false,false,
                false,false,false,false,false,false,false,false,false,false],
    showIndex: 0,

  },
  // 展开折叠选择  
  changeToggle: function (e) {
    var index = e.currentTarget.dataset.index;
    if (this.data.selectedFlag[index]) {
      this.data.selectedFlag[index] = false;
    } else {
      this.data.selectedFlag[index] = true;
    }

    this.setData({
      selectedFlag: this.data.selectedFlag
    })

    // if (e.currentTarget.dataset.index != this.data.showIndex) {
    //   this.setData({
    //     showIndex: e.currentTarget.dataset.index
    //   })
    // } else {
    //   this.setData({
    //     showIndex: 0
    //   })
    // }
  },


  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(this.data.selectedFlag)
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    console.log(this.data.selectedFlag)
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})